package gr.hua.dit.ds.ds2024Team77.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import gr.hua.dit.ds.ds2024Team77.repository.messagesRepository;
import gr.hua.dit.ds.ds2024Team77.entities.messages;
import java.util.List;

@Service
public class messagesService {

    private messagesRepository messagesRepository;

    public messagesService(gr.hua.dit.ds.ds2024Team77.repository.messagesRepository messagesRepository) {
        this.messagesRepository = messagesRepository;
    }

    @Transactional
    public List<messages> getMessages(){
        return messagesRepository.findAll();
    }

    @Transactional
    public messages getMessages(Integer message_id){
        return messagesRepository.findById(message_id).get();
    }

    @Transactional
    public void saveMessages(messages messages){
        messagesRepository.save(messages);
    }
}