public class Bicycle {
	private String ownerName;
	private String tagNo;
	private String id;
	
	
		public Bicycle() {
			setOwnerName("Null");
			setTagNo("Null");
	}
	
			public Bicycle(String tagNo,String name) {
				this.setId(tagNo);
				this.ownerName=name;
			}


	public String getTagNo() {
		return tagNo;
	}
	public void setTagNo(String tagNo) {
		this.tagNo = tagNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getId() {
		return id;
	}
	public void setId(String Idnum) {
		this.id = Idnum;
	}
}
