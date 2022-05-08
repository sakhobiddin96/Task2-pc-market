package uz.pdp.task2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.task2.entity.accessories.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Accessories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToMany
    private List<PowerSupply> powerSupplies;
    @OneToMany
    private List<Ram> rams;
    @OneToMany
    private List<ProcessorsInTashkent> processorsInTashkents;
    @OneToMany
    private List<Ssd> ssds;
    @OneToMany
    private List<MotherBoard> motherBoards;
    @OneToMany
    private List<CoolingSystems> coolingSystems;
    @OneToMany
    private List<HardDisc> hardDiscs;

}
