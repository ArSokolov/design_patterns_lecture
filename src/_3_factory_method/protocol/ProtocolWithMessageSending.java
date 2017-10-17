package _3_factory_method.protocol;

import _3_factory_method.message.MessageProcessor;
import _3_factory_method.message.MessageSender;

public abstract class ProtocolWithMessageSending {

    // помимо создания объектов занимается еще кучей полезных вещей

    // Factory Method
    public abstract MessageSender createMessageSender();


    // а если уже несколько разных интерфейсов, подклассы которых должны согласованно работать
    public MessageProcessor createMessageProcessor() {
        return new MessageProcessor() { public void prepare(String message) {}};
    }
}
