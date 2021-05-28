package day32_arrays_split;

public class AWSZones {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";
        System.out.println("----- Deploying ETSY app to AWS Zones -----");
        String[] zonesToDeploy = zones.split(",");

        for (String eachZone : zonesToDeploy) {

            System.out.println(" Deploying etsy to " + eachZone + "\n" + eachZone +
                    " deployment is completed");
        }
        System.out.println("\nAll deployments completed. Traffic enabled.");
    }
}
