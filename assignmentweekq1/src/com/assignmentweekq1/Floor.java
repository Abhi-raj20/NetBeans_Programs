package com.assignmentweekq1;

public class Floor {
            private int length;
            private int width;

          Floor(int length, int width){
            this.length=length;
            this.width=width;
        }

        void totalTiles(Title t){
            double TitleArea = t.getArea();
            double floorArea = length*width;
            double noOfTiles = floorArea/TitleArea;
        }

}
