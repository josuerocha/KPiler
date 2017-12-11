package dataunits;

/**
 *
 * @author jr
 */


public class Instruction {
    
    private int address;
    private String minemonic;
    private int branchAddress;

    public Instruction(String minemonic){
        this.minemonic = minemonic;
    }
    
    public int getAddress() {
        return address;
    }
    
    public boolean patchAddress(int address){
        minemonic = minemonic.replace("_", Integer.toString(address));
        
        return !minemonic.contains("_");
    }

    public String getMinemonic() {
        return this.minemonic;
    }

    public int getBranchAddress() {
        return branchAddress;
    }
    
    @Override
    public String toString(){
        return this.minemonic;
    }
    
}
