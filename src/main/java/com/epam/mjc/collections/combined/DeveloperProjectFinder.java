package com.epam.mjc.collections.combined;

import java.util.*;

class DeveloperComparator implements Comparator<String>
{
    @Override
    public int compare(String o1, String o2) {
        if(o1.length() == o2.length())
            return o2.compareTo(o1);
        else
            return o2.length() - o1.length();

    }
}
public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> projectsOfDeveloper = new ArrayList<>();
        for(Map.Entry<String, Set<String>> me : projects.entrySet())
        {
            if(me.getValue().contains(developer))
                projectsOfDeveloper.add(me.getKey());
        }
        Collections.sort(projectsOfDeveloper, new DeveloperComparator());
        return projectsOfDeveloper;
    }
}
