import java.util.ArrayList;
import java.time.LocalDate;

public class Warehouse {

    private ArrayList<Medicine> medicines = new ArrayList<>();
    private ArrayList<WarehouseMovement> movements = new ArrayList<>();

    public void createNewMedicine(String name, String code, double price, int stock, CategoryOfMedicine category) {
        Medicine medicine = new Medicine(name, code, price, stock, category);
        medicines.add(medicine);
    }

    private void validation(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive");
        }
    }

    public void seeAllMedicines() {

        for (int i = 0; i < medicines.size(); i++) {
            System.out.println(medicines.get(i));
        }
    }

    public void importStock(int quantity, Medicine medicine) {
        validation(quantity);
        int newStock = medicine.getStock() + quantity;
        medicine.setStock(newStock);
        movements.add(new WarehouseMovement("IMPORT", medicine, quantity, LocalDate.now()))
    }

    public void exportStock(int quantity, Medicine medicine) {
        validation(quantity);
        int newStock = medicine.getStock() - quantity;
        medicine.setStock(newStock);
    }

    public void seeExportMovements(Medicine medicine, LocalDate startDate, LocalDate endDate) {
        for (WarehouseMovement x : movements) {

            if (x.getMovementType().equals("EXPORT") && x.getMedicine().equals(medicine)
                    && (!x.getMovementDate().isBefore(startDate) && !x.getMovementDate().isAfter(endDate))) {
                System.out.println(x);
            }
        }
    }

}
