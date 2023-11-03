
package com.assignmentweekq1;


public class Title {
        private int edge;
    private int area;

    Title(int edge){
        this.edge=edge;
        this.area=edge*edge;
    }

    int getArea(){
        return area;
    }
}
