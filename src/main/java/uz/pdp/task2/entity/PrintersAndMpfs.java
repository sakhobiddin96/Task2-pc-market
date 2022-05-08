package uz.pdp.task2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrintersAndMpfs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String brand;
    private double price;
    private String printColor;
    private boolean twoSidedPrinting;
    private String deviceFeatures;
    private String maximumFormat;
    private String blackPrintSpeed;
    private String colorPrintSpeed;
    private String connectivity;
}
