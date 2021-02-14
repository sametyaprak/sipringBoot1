package com.example.springBoot.service;

import com.example.springBoot.repository.TopicRepository;
import com.example.springBoot.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;


//    private List<Topic> myAllTopicList = new ArrayList<>(Arrays.asList(
//            new Topic("2","ali","ikinci"),
//            new Topic("3","samet","ucuncu"),
//            new Topic("4","veli","dorduncu"),
//            new Topic("5","ozlem","besinci")));


    public List<Topic> getAllTopics(){
        //return myAllTopicList;
        List<Topic>topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id){
        //string icin
        //return myAllTopicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        //int icin
        //return myAllTopicList.stream().filter(t -> t.getId()==(id)).findFirst().get();
        return topicRepository.findById(id).orElse(null);

    }

    public void addTopic(Topic topic){
        //myAllTopicList.add(topic);
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic,String id){
//        for(Topic w:myAllTopicList){
//            if(w.getId().equals(id)){
//                w.setId(id);
//                w.setName(topic.getName());
//                w.setDescription(topic.getDescription());
//            }
//        }
        topicRepository.save(topic);
    }

    public void deteleTopic(String id) {
//        for(int i=0;i<myAllTopicList.size();i++){
//            if(myAllTopicList.get(i).getId().equals(id)){
//                myAllTopicList.remove(myAllTopicList.get(i));
//            }
//        }
        topicRepository.deleteById(id);
    }
}
