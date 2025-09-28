import java.time.LocalDate;

public class WarehouseMovement {
    private final String movementType;
    private final Medicine medicine;
    private final int quantity;
    private final LocalDate movementDate;

    public WarehouseMovement(String movementType, Medicine medicine, int quantity, LocalDate movementDate) {
        this.movementType = movementType;
        this.medicine = medicine;
        this.quantity = quantity;
        if (movementDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Can't be a future date");
        }
        this.movementDate = movementDate;

    }

    public String getMovementType() {
        return movementType;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getMovementDate() {
        return movementDate;
    }

    @Override
    public String toString() {
        return "WarehouseMovement{" +
                "movementType=" + movementType +
                "medicine=" + medicine +
                "quantity=" + quantity +
                "movementDate=" + movementDate +
                "}";
    }
}
