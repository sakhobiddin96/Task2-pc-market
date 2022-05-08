package uz.pdp.task2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.task2.entity.pcPeripherals.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PcPeripherals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToMany
    private List<PcCase> pcCases;
    @OneToMany
    private List<Speakers> speakers;
    @OneToMany
    private List<Headphones> headphones;
    @OneToMany
    private List<KeyboardsAndMouses> keyboardsAndMouses;
    @OneToMany
    private List<Ups> ups;
    @OneToMany
    private List<UsbHdd> usbHdds;
    @OneToMany
    private List<MousePads> mousePads;
    @OneToMany
    private List<CougarAccessories> cougarAccessories;
    @OneToMany
    private List<NetworkFilters> networkFilters;
    @OneToMany
    private List<FlashDrives> flashDrives;
}
