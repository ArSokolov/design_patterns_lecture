package _3_factory_method;

import _3_factory_method.protocol.HttpProtocol;
import _3_factory_method.protocol.Pop3Protocol;
import _3_factory_method.protocol.ProtocolWithMessageSending;

public class Main {

    public static void main(String[] args) {

        ProtocolWithMessageSending protocol = new HttpProtocol();

        new SubProgramThatSends(protocol.createMessageSender());





        ProtocolWithMessageSending abstractFactoryForProtocol = new Pop3Protocol();

        // допустим эти 2 подпрограммы взаимодействуют между собой
        // и нужно чтобы отсылаемое сообщение было предобработано в соответствии с протоколом
        // такое согласование обеспечивается абстрактной фабрикой
        new SubProgramThatPrepareMessage(abstractFactoryForProtocol.createMessageProcessor());
        new SubProgramThatSends(abstractFactoryForProtocol.createMessageSender());

    }

}
