class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {
        int m = servers.length;
        int n = tasks.length;
        int ans[] = new int[n];

        PriorityQueue<int[]> freeState = new PriorityQueue<>(
                    (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1])
                );
        for (int i = 0; i < m; i++) {
            freeState.add(new int[] { servers[i], i });
        }
        // int t1 = freeState.size();
        // for (int i = 0; i < t1; i++) {
        //     int t[] = freeState.poll();
        //     System.out.println(t[0] + " " + t[1]);
        // }
        PriorityQueue<int[]> busyState = new PriorityQueue<>(
                (a,b) -> a[0] != b[0] ? Long.compare(a[0],b[0]) 
                       : a[1] != b[1] ? Integer.compare(a[1], b[1]) : Integer.compare(a[2], b[2])
            );

        for(int t=0; t<n; t++){
            while(!busyState.isEmpty() && (t >= busyState.peek()[0])){  //when current time t is greater than the busy-state server(with least end-time), will move that server from busy to free state
                int fromBusy[] = busyState.poll();
                
                int wt = fromBusy[1];
                int idx = fromBusy[2];
                
                freeState.add(new int[]{wt, idx});
            }
            
            if(freeState.isEmpty()){      //all serverse are busy
                int fromBusy[] = busyState.poll();
                
                long availableTime = fromBusy[0];
                int wt = fromBusy[1];
                int idx = fromBusy[2];

                busyState.add(new int[]{(int)(availableTime+tasks[t]), wt, idx});
                ans[t] = idx;
            }else if(!freeState.isEmpty() ){    //want to bring a free-state server to a busy-state
                int pollingFromFreeState[] = freeState.poll();

                int wt =  pollingFromFreeState[0];
                int idx = pollingFromFreeState[1];
                int endTime = t + tasks[t];

                busyState.add(new int[]{endTime, wt, idx});
                ans[t] = idx;
            }
        }

        return ans;
    }
}