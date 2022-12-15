package org.example.Model;

public class RentalCompany {
    public String name;
    public String internetDomain;
    public String address;
    public String owner;
    public Branch branch;

    public RentalCompany(String name,
                         String internetDomain,
                         String address,
                         String owner,
                         Branch branches
    ) {
        this.name = name;
        this.internetDomain = internetDomain;
        this.address = address;
        this.owner = owner;
        this.branch = branches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInternetDomain() {
        return internetDomain;
    }

    public void setInternetDomain(String internetDomain) {
        this.internetDomain = internetDomain;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Branch getBranches() {
        return branch;
    }

    public void setBranches(Branch branches) {
        this.branch = branches;
    }

    @Override
    public String toString() {
        return "RentalCompany{" +
                "name='" + name + '\'' +
                ", internetDomain='" + internetDomain + '\'' +
                ", address='" + address + '\'' +
                ", owner='" + owner + '\'' +
                ", branch=" + branch +
                '}';
    }
}
