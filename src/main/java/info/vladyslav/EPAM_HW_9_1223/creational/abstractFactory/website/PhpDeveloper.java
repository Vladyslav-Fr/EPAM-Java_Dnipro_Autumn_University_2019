package info.vladyslav.EPAM_HW_9_1223.creational.abstractFactory.website;

import info.vladyslav.EPAM_HW_9_1223.creational.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void wrightCode() {
        System.out.println("Php developers wrights php code...");
    }
}
