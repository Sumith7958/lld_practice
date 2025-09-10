package org.example.LLD.ObserverDesginPattern.Repo;
import org.example.LLD.ObserverDesginPattern.Model.Display;
import java.util.HashSet;
import java.util.Set;

public class DisplayRepo {

    Set<Display> displayList=new HashSet<Display>();

    public void addDisplay(Display display){
        displayList.add(display);
    }

    public void removeDisplay(Display display){
        if(displayList.remove(display)){
            System.out.println("Removed");
        }else{
            System.out.println("Nothing to remove");
        }
    }

    public void notifyUsers(int prevTemp,int currTemp){
        for(Display it: displayList){
            it.update(prevTemp,currTemp);
        }
    }


}
