package transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class DiagnosticStation {
    private final Queue<Transport> transportQueue = new ArrayDeque<>();

    public void addTransport(Transport transport) {
        if (transport instanceof Bus) {
            System.out.println("Автобусы ТО не проходят");
        } else {
            transportQueue.add(transport);
        }
    }
    public void doDiagnostics(){
        Transport transport = transportQueue.poll();
        if (transport != null){
            transport.getMechanics().get(0).carryOutMaintenance();
        }
    }
}
