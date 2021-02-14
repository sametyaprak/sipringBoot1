package com.example.springBoot.service;

import com.example.springBoot.topic.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {


    private List<Topic> myAllTopicList = new ArrayList<>(Arrays.asList(
            new Topic("ali",2,"ikinci"),
            new Topic("veli",3,"ucuncu"),
            new Topic("ali",4,"dorduncu"),
            new Topic("veli",5,"besinci")));


    public List<Topic> getAllTopics(){
        return myAllTopicList;
    }

    public Topic getTopic(int id){
        //return myAllTopicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return myAllTopicList.stream().filter(t -> t.getId()==(id)).findFirst().get();
    }

    public void addTopic(Topic topic){
        myAllTopicList.add(topic);
    }

    public void updateTopic(Topic topic,int id){
        for(Topic w:myAllTopicList){
            if(w.getId()==id){
                w.setId(id);
                w.setName(topic.getName());
                w.setDescription(topic.getDescription());
            }
        }
    }

    public void deteleTopic(int id) {
        for(int i=0;i<myAllTopicList.size();i++){
            if(myAllTopicList.get(i).getId()==id){
                myAllTopicList.remove(myAllTopicList.get(i));
            }
        }
    }
}
