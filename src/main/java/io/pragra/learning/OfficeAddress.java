package io.pragra.learning;

import java.text.NumberFormat;

public class OfficeAddress implements iAddress{
    private String officeName;
    private NumberFormat format;

    public OfficeAddress(String officeName, NumberFormat format) {
        this.officeName = officeName;
        this.format = format;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public NumberFormat getFormat() {
        return format;
    }

    public void setFormat(NumberFormat format) {
        this.format = format;
    }

    @Override
    public String getAddress() {
        return toString();
    }

    @Override
    public String toString() {
        return "OfficeAddress{" +
                "officeName='" + officeName + '\'' +
                ", format=" + format +
                '}';
    }
}
