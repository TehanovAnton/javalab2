package by.belstu.it.tehanov;

import java.util.Objects;

public class WrapperString {

    private String field;

    public WrapperString(String field) {
        this.field = field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    @Override
    public String toString() {
        return "WrapperString{" +
                "field='" + field + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrapperString that = (WrapperString) o;
        return Objects.equals(field, that.field);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field);
    }

    public void replace(char oldChar, char newChar) {
        field.replace(oldChar, newChar);
    }
}
