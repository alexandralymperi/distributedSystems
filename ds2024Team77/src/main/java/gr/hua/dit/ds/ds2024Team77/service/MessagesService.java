package gr.hua.dit.ds.ds2024Team77.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import gr.hua.dit.ds.ds2024Team77.repository.MessagesRepository;
import gr.hua.dit.ds.ds2024Team77.entities.Messages;
import java.util.List;

@Service
public class MessagesService {

    private MessagesRepository messagesRepository;

    public MessagesService(MessagesRepository messagesRepository) {
        this.messagesRepository = messagesRepository;
    }

    @Transactional
    public List<Messages> getMessages(){
        return messagesRepository.findAll();
    }

    @Transactional
    public Messages getMessages(Integer message_id){
        return messagesRepository.findById(message_id).get();
    }

    @Transactional
    public void saveMessages(Messages messages){
        messagesRepository.save(messages);
    }
}