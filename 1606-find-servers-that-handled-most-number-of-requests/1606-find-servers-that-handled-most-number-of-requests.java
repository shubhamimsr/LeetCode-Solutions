class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        int n = load.length;
        
        TreeSet<Integer> freeServers = new TreeSet<>();
        for(int i=0; i<k; i++){
            freeServers.add(i);
        }
        System.out.println("Servers: "+freeServers);

        //MIN-HEAP => [endTime,ServerNo.]
        PriorityQueue<int[]> busyState = new PriorityQueue<>(
            (a,b)-> a[0]!=b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1])
        );

        int requestCount[] = new int[k];
        int maxRequest = 0;

        for(int t=0; t<n; t++){
            int arriveTime = arrival[t];
            int processingLoad = load[t];
            int totalProcessingTime = arriveTime+ processingLoad;

            while(!busyState.isEmpty() && busyState.peek()[0] <= arriveTime){
                int lastServerDetials[] = busyState.poll();
                int serverId = lastServerDetials[1];

                freeServers.add(serverId);
            }
            if(freeServers.isEmpty()){          //drop current arriving req
                continue;
            }

            // if(busyState.isEmpty())
            int target = t%k;

            // Integer higherServer = freeServers.higher(target);
            // Integer targetServer = freeServers.contains(target) ? target : freeServers.higher(target);
            // Integer targetServer = (higherServer != null) ? higherServer : freeServers.first();

            Integer targetServer;
            if(freeServers.contains(target)){
                targetServer = target;
            }else{
                targetServer = freeServers.higher(target);

                if(targetServer == null){
                    targetServer = freeServers.first();
                }
            }   
            // if(targetServer == null){
            //     targetServer = freeServers.first();  
            // }
            if(targetServer != null){
                freeServers.remove(targetServer);
                busyState.add(new int[]{totalProcessingTime, targetServer});
                requestCount[targetServer]++;

                maxRequest = Math.max(maxRequest, requestCount[targetServer]);
            }

           
        }

        List<Integer> busiestServers = new ArrayList<>();
        for(int i=0; i<k; i++){
            if(requestCount[i] == maxRequest){
                busiestServers.add(i);
            }
        }
        return busiestServers;
    }
}