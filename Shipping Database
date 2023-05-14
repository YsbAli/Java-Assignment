//	Write a java program using interface for the shipping database. It should contain 3 classes and 3 member functions.


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Interface for the shipping database
interface ShippingInterface {
    void addPackage(Package pkg);
    void removePackage(int packageId);
    void displayPackages();
}

// ShippingDatabase class implementing the ShippingInterface
class ShippingDatabase implements ShippingInterface {
    private List<Package> packages;

    public ShippingDatabase() {
        packages = new ArrayList<>();
    }

    @Override
    public void addPackage(Package pkg) {
        packages.add(pkg);
        System.out.println("Package added successfully.");
    }

    @Override
    public void removePackage(int packageId) {
        for (int i = 0; i < packages.size(); i++) {
            Package pkg = packages.get(i);
            if (pkg.getPackageId() == packageId) {
                packages.remove(i);
                System.out.println("Package removed successfully.");
                return;
            }
        }
        System.out.println("Package with ID " + packageId + " not found.");
    }

    @Override
    public void displayPackages() {
        if (packages.isEmpty()) {
            System.out.println("No packages in the database.");
            return;
        }

        System.out.println("Packages in the database:");
        for (Package pkg : packages) {
            System.out.println(pkg.toString());
        }
    }
}

// Package class representing a package
class Package {
    private int packageId;
    private String packageName;

    public Package(int packageId, String packageName) {
        this.packageId = packageId;
        this.packageName = packageName;
    }

    public int getPackageId() {
        return packageId;
    }

    @Override
    public String toString() {
        return "Package ID: " + packageId + ", Name: " + packageName;
    }
}

// Shipper class to demonstrate the usage of the ShippingDatabase
// class Shipper {
    class ShippingDB {
    public static void main(String[] args) {
        ShippingDatabase database = new ShippingDatabase();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Shipping Database Menu:");
            System.out.println("1. Add Package");
            System.out.println("2. Remove Package");
            System.out.println("3. Display Packages");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter package ID: ");
                    int packageId = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter package name: ");
                    String packageName = scanner.nextLine();
                    Package pkg = new Package(packageId, packageName);
                    database.addPackage(pkg);
                    break;
                case 2:
                    System.out.print("Enter package ID to remove: ");
                    int removePackageId = scanner.nextInt();
                    database.removePackage(removePackageId);
                    break;
                case 3:
                    database.displayPackages();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        } while (choice != 4);

        scanner.close();
    }
}
