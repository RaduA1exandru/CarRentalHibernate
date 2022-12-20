// nu folosim inca






//package org.example.Model;
//
//import javax.persistence.*;
//import java.util.List;
//@Entity
//@Table(name="rental_company")
//public class RentalCompany {
//@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
//@Column(name ="rental")
//    public Integer rentalCompanyId
//
//    public String name;
//    public String internetDomain;
//    public String address;
//    public String owner;
//    public List<Branch> branches;
//
//    public RentalCompany() {
//        }
//
//    public RentalCompany(String name, String internetDomain, String address, String owner, List < Branch > branches) {
//            this.name = name;
//            this.internetDomain = internetDomain;
//            this.address = address;
//            this.owner = owner;
//            this.branches = branches;
//        }
//
//        public String getName () {
//            return name;
//        }
//
//        public void setName (String name){
//            this.name = name;
//        }
//
//        public String getInternetDomain () {
//            return internetDomain;
//        }
//
//        public void setInternetDomain (String internetDomain){
//            this.internetDomain = internetDomain;
//        }
//
//        public String getAddress () {
//            return address;
//        }
//
//        public void setAddress (String address){
//            this.address = address;
//        }
//
//        public String getOwner () {
//            return owner;
//        }
//
//        public void setOwner (String owner){
//            this.owner = owner;
//        }
//
//        public List<Branch> getBranches () {
//            return branches;
//        }
//
//        public void setBranches (List < Branch > branches) {
//            this.branches = branches;
//        }
//
//        @Override
//        public String toString () {
//            return "RentalCompany{" +
//                    "name='" + name + '\'' +
//                    ", internetDomain='" + internetDomain + '\'' +
//                    ", address='" + address + '\'' +
//                    ", owner='" + owner + '\'' +
//                    ", branches=" + branches +
//                    '}';
//        }
//    }