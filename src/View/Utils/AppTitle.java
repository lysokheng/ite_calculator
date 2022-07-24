package View.Utils;

public enum AppTitle {
    ARITHMETIC("Arithmetic"),
    BINARY_ARITHMETIC("Binary Arithmetic"),
    BITWISE_BINARY("Bitwise Binary"),
    BITWISE_DECIMAL("Bitwise Decimal"),
    MONEY_EXCHANGE("Money Exchange"),
    NUMBER_SYSTEM_CONVERSION_BINARY("Number System Conversion Binary"),
    NUMBER_SYSTEM_CONVERSION_DECIMAL("Number System Conversion Decimal"),
    NUMBER_SYSTEM_CONVERSION_HEXADECIMAL("Number System Conversion Hexadecimal"),
    NUMBER_SYSTEM_CONVERSION_OCTAL("Number System Conversion Octal"),
    SET_THEORY("Set Theory"),
    STORAGE_CONVERTER("Storage Converter"),
    TRIGONOMETRY("Trigonometry"),
    INPUT("Input"),
    HISTORY("History"),
    RESULT("Result"),
    A("A:"),
    B("B:"),
    AMOUNT("Amount:")
    ;
    private final String displayName;

    AppTitle(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
