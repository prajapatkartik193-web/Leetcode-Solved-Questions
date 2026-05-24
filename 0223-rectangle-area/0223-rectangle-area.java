class Solution {
    
     class Point{
        int x;
        int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
     }    

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        
        Point p1 = new Point(A, B);
        Point p2 = new Point(C, D);
        Point p3 = new Point(E, F);
        Point p4 = new Point(G, H);

        int areaOfSqrA = (p2.x - p1.x) * (p2.y - p1.y);
        int areaOfSqrB = (p4.x - p3.x) * (p4.y - p3.y);
        
        int left = Math.max(p1.x, p3.x);       
        int right = Math.min(p4.x, p2.x);       
        int bottom = Math.max(p3.y, p1.y);
        int top = Math.min(p2.y, p4.y);

        int overlap = 0;
        if(right > left && top > bottom)
             overlap = (right - left) * (top - bottom);        
        return areaOfSqrA + areaOfSqrB - overlap;   
    }
}