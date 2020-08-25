public class Duration {
        private int startHrs, endHrs, startMins, endMins;

        public Duration(int startHrs, int startMins,  int endHrs, int endMins){
            this.startHrs = startHrs;
            this.endHrs = endHrs;
            this.startMins = startMins;
            this.endMins = endMins;
        }
        public void setStartHrs(int startHrs){
            this.startHrs = startHrs;
        }
        public int getStartHrs() {
            return startHrs;
        }
        public void setEndHrs(int endHrs) {
            this.endHrs = endHrs;
        }
        public int getEndHrs() {
            return endHrs;
        }
        public void setStartMins(int startMins) {
            this.startMins = startMins;
        }
        public int getStartMins() {
            return startMins;
        }
        public void setEndMins(int endMins) {
            this.endMins = endMins;
        }
        public int getEndMins() {
            return endMins;
        }
        public int getlength(){
            return ((endHrs * 60) + endMins) - ((startHrs * 60) + startMins);
        }
        public String toString() {
            return "The start time is " + startHrs + ":" + startMins + ".  The end time is " + endHrs + ":" + endMins + ".";
        }
    }
