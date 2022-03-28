package src.jappware;

import src.cycle.Bicycle;
import src.cycle.Frame;
import src.jappware.enums.Firm;

public class Rymar {
    void upgradeComputer(Computer pc) {
        if (pc.isOfficeProperty()) {
            int realizeYear = pc.getReleaseYear();
            pc.setReleaseYear(realizeYear + 1);
            int memory = pc.getMemory();
            pc.setMemory(memory * 2);
        } else {
            Firm firm = Firm.APPLE;
            pc.setFirm(firm);
        }
    }

    void upgradePayment(Payment pt) {
        if (pt.getSize() >= 4000) {
            System.out.println("buy pizza for us");
        }
        if (pt.getSize() < 4000) {
            int size = pt.getSize();
            pt.setSize(size + 1000);

        }
    }
}
