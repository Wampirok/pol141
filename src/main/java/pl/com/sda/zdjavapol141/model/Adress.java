package pl.com.sda.zdjavapol141.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Adress {
    private String street;
    private String buildingNo;
    private String apartamentNo;
    private String postalCode;
}
