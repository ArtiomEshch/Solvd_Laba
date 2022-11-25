package com.solvd.task2.users;

public class Buyer extends User {
    private String phone;
    private double bonus;

    public Buyer(String phone, double bonus) {
        this.phone = phone;
        this.bonus = bonus;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Buyer buyer = (Buyer) o;

        if (Double.compare(buyer.bonus, bonus) != 0) return false;
        return phone != null ? phone.equals(buyer.phone) : buyer.phone == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = phone != null ? phone.hashCode() : 0;
        temp = Double.doubleToLongBits(bonus);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "phone='" + phone + '\'' +
                ", bonus=" + bonus +
                '}';
    }
}
