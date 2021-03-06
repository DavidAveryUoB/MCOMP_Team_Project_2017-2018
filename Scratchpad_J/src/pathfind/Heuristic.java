package pathfind;

import common.datatypes.Waypoint;

public class Heuristic {
      
    //cost function gives minimum cost of D
    //Simple Case is to set D = 1
    //D2 is the cost of moving diagonally
    //If we set D and D1 = 1 we are using the Chebyshev distance/metric
    //If we set D = 1 and D2 = sqrt(2) we are using the octile distance/metric
    //----TO DO: REFACTOR D/D2----
    double D = 1;
    double D2 = 1.5;
    
    
    //Manhattan Distance Heuristic
    //Takes in start node and goal node (a and b)
    //Find non negative difference in x values and y values between nodes;
    //Calculate hx using Manhattan distance heuristic.
    public Double manhattanHeuristic(Waypoint a, Waypoint b){
        double xDiff = Math.abs(a.getX() - b.getX());
        double yDiff = Math.abs(a.getY() - b.getY());
        
        double hx = D * (xDiff + yDiff);
        return hx;
    }
    
    //Diagonal Distance Heuristic
    //Takes in start node and goal node (a and b)
    //Find non negative difference in x values and y values between nodes;
    //Calculate hx using Diagonal distance heuristic.
    public Double DiagonalHeuristic(Waypoint a, Waypoint b){
        double xDiff = Math.abs(a.getX() - b.getX());
        double yDiff = Math.abs(a.getY() - b.getY());
        
        double hx = ((xDiff + yDiff) + (D2 - 2 * D) * Math.min(xDiff, yDiff));
        return hx;
    }
    
    //Euclidean Distance Heuristic
    //Takes in start node and goal node (a and b)
    //Find non negative difference in x values and y values between nodes;
    //Calculate hx using Euclidean distance heuristic.
    public Double euclideanHeuristic(Waypoint a, Waypoint b){
        double xDiff = Math.abs(a.getX() - b.getX());
        double yDiff = Math.abs(a.getY() - b.getY());
        
        double hx = D * Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
        return hx;
    }
    
        
    public Double distanceX(Waypoint a, Waypoint b){
        double xDiff = Math.abs(a.getX() - b.getX());
        return xDiff;
    }
    
    public Double distanceY(Waypoint a, Waypoint b){
        double yDiff = Math.abs(a.getY() - b.getY());
        return yDiff;
    }

}
