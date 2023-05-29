class ParkingSystem {

    int[] available = new int[3];

    public ParkingSystem(int big, int medium, int small) {
        available[0]=big;
        available[1]=medium;
        available[2]=small;
    }
    
    public boolean addCar(int carType) {
        switch(carType){
            case 1:
                if(available[0]==0){
                    return false;
                }else{
                    available[0]-=1;
                    return true;
                }
            case 2:
                if(available[1]==0){
                    return false;
                }else{
                    available[1]-=1;
                    return true;
                }
            case 3:
                if(available[2]==0){
                    return false;
                }else{
                    available[2]-=1;
                    return true;
                }
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */