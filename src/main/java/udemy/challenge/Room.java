package udemy.challenge;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Room {
    private HomeAppliances myHomeAppliances;
    private Furnitures furnitures;
    private ElectronicalGadgets electronicalGadgets;

    public void OpenDoor(String doorHandle, String key){
        System.out.println();
    }
}

