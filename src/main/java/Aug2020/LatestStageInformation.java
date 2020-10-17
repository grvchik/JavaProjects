package Aug2020;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

class StageDetails implements Comparable<StageDetails> {
	
	private int requestId;
	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public String getApproverId() {
		return approverId;
	}

	public void setApproverId(String approverId) {
		this.approverId = approverId;
	}

	public String getStageName() {
		return stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

	public String getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	public int getStageSequence() {
		return stageSequence;
	}

	public void setStageSequence(int stageSequence) {
		this.stageSequence = stageSequence;
	}

	private String approverId;
	private String stageName;
	private String itemStatus;
	private int stageSequence;
	
	public StageDetails(int requestId, String approverId, String stageName,String stageSuquence,String itemStatus) {
		this.requestId = requestId;
		this.approverId = approverId;
		this.stageName = stageName;
		
		String stage[] = stageSuquence.split("-");
		String stageSeqStr="";
		if(stage.length==2) {
			stageSeqStr = stage[0];
		}
		this.stageSequence = Integer.valueOf(stageSeqStr);
	}

	@Override
	public int compareTo(StageDetails o) {
		// TODO Auto-generated method stub
		return this.stageSequence-o.stageSequence;
	}
}


public class LatestStageInformation {

	private static List<StageDetails> stgeList = new ArrayList<StageDetails>();
	
	
	public static void prepareData() {
		StageDetails stg1 = new StageDetails(11,"P000002", "ROLEOWNER", "2-3", "P");
		
		StageDetails stg2 = new StageDetails(11,"P000002", "SECURITY", "3-3", "P");
		stgeList.add(stg1);
		stgeList.add(stg2);
	}
	
	public static List<StageDetails> getRequestsForMe(String user) {
		
		Set<Integer> uniqueRequests = new HashSet<Integer>();
		PriorityQueue<StageDetails> pqStage = new PriorityQueue<StageDetails>();
		for(int i=0;i<stgeList.size();i++) {
			StageDetails stg = stgeList.get(i);
			uniqueRequests.add(stg.getRequestId());
			pqStage.add(stg);			
		}
		
		List<StageDetails> finalList = new ArrayList<StageDetails>();
		
		while(!pqStage.isEmpty()) {
			StageDetails currStage = pqStage.poll();
			if(uniqueRequests.contains(currStage.getRequestId())) {
				uniqueRequests.remove(currStage.getRequestId());
				finalList.add(currStage);
			}
		}
		return finalList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prepareData();
		
		List<StageDetails> filteredData = getRequestsForMe("P000002");
		System.out.println(filteredData);
	}

}
