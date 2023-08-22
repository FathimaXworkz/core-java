class Speaker{
static String speakerBrandName="GOVO";
static boolean isConnected ;
static int maxVolume=6;
static int currentVolume;
static int minVolume;
public static void main(String speaker[]){
System.out.println("main started");
System.out.println(" The speaker brand name is " +speakerBrandName);
System.out.println("speaker connection status");
isConnected = true ;
System.out.println(" is speaker connected " +isConnected);
isConnected = false ;
System.out.println(" is speaker connected " +isConnected);
System.out.println("The max volume of speaker is " +maxVolume);
 currentVolume = currentVolume + 1 ;
 currentVolume = currentVolume + 1 ;
 currentVolume = currentVolume + 1 ;
 currentVolume = currentVolume + 1 ;
 currentVolume = currentVolume + 1 ;
 currentVolume = currentVolume + 1 ;
 currentVolume = currentVolume + 1 ;
 currentVolume = currentVolume + 1 ;
 System.out.println("The current volume is " +currentVolume);
System.out.println("main ended");
}
}