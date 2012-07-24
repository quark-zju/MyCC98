/**
 * 
 */
package tk.djcrazy.libCC98.data;


/**
 * A class that represents an item in the hot topic list
 * @author DJ
 *
 */
public class HotTopicEntity {
	/**
	 * @return the topicName
	 */
	public String getTopicName() {
		return topicName;
	}
	/**
	 * @param topicName the topicName to set
	 */
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	/**
	 * @return the postLink
	 */
	public String getPostLink() {
		return postLink;
	}
	/**
	 * @param postLink the postLink to set
	 */
	public void setPostLink(String postLink) {
		this.postLink = postLink;
	}
	/**
	 * @return the boardName
	 */
	public String getBoardName() {
		return boardName;
	}
	/**
	 * @param boardName the boardName to set
	 */
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	/**
	 * @return the postAuthor
	 */
	public String getPostAuthor() {
		return postAuthor;
	}
	/**
	 * @param postAuthor the postAuthor to set
	 */
	public void setPostAuthor(String postAuthor) {
		this.postAuthor = postAuthor;
	}
	/**
	 * @return the postTime
	 */
	public String getPostTime() {
		return postTime;
	}
	/**
	 * @param postTime the postTime to set
	 */
	public void setPostTime(String postTime) {
		this.postTime = postTime;
	}
	/**
	 * @return the focusNumber
	 */
	public int getFocusNumber() {
		return focusNumber;
	}
	/**
	 * @param focusNumber the focusNumber to set
	 */
	public void setFocusNumber(int focusNumber) {
		this.focusNumber = focusNumber;
	}
	/**
	 * @return the replyNumber
	 */
	public int getReplyNumber() {
		return replyNumber;
	}
	/**
	 * @param replyNumber the replyNumber to set
	 */
	public void setReplyNumber(int replyNumber) {
		this.replyNumber = replyNumber;
	}
	/**
	 * @return the clickNumber
	 */
	public int getClickNumber() {
		return clickNumber;
	}
	/**
	 * @param clickNumber the clickNumber to set
	 */
	public void setClickNumber(int clickNumber) {
		this.clickNumber = clickNumber;
	}
	private String topicName="";
	private String postLink="";
	private String boardName="";
	private String postAuthor="";
	private String postTime="";
	private int focusNumber=0;
	private int replyNumber=0;
	private int clickNumber=0;
	
	
}
