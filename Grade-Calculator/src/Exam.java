/******************************************************************************************
 * Exam.java
 * 
 * @author Branden E. Smith
 *
 * This class represents and exam object. 
 ******************************************************************************************/

public class Exam {
	
	/* Class variables are private so that they cannot be accessed from outside
	 * this class.
	 */
	private double pointsPossible;
	private double pointsReceived;
	private double numberWrong;
	private double score;

	/**
	 * Default Constructor initializes <code>pointsPossible, 
	 * numberWrong, pointsReceived</code>, and <code>score</code> to 0.
	 */
	public Exam(){
		this.pointsPossible = 0;
		this.numberWrong = 0;
		this.pointsReceived = 0;
		this.score = 0;
	}
	
	/**
	 * Creates an Exam object with the following attributes.
	 * 
	 * @param pointsPossible The number of points the exam is worth.
	 * @param numberWrong The number of points lost on the exam. 
	 */
	public Exam(double pointsPossible, double numberWrong){
		this.pointsPossible = pointsPossible;
		this.numberWrong = numberWrong;
		this.pointsReceived = pointsPossible - numberWrong;
		
		/*
		 * Automatically calculate the number of points received based
		 * on the number possible and the number of points missed. 
		 * 
		 * This safeguards against a run-time that will occur
		 * if the number of pointsPossible is zero.
		 * ("Dividing by zero will make your paper burst into flames.")
		 */
		if(pointsPossible != 0){
			this.score = (pointsReceived/pointsPossible);
		}else{
			this.score = 0;
		}
	}
	
	/**
	 * Gets the number of points possible on the exam.
	 * @return pointsPossible
	 */
	public double getPointsPossible(){
		return this.pointsPossible;
	}
	
	/**
	 * Gets the number of points received on the exam.
	 * @return pointsReceived
	 */
	public double getPointsReceived(){
		return this.pointsReceived;
	}

	/**
	 * Gets the number of points missed on the exam.
	 * @return numberWrong
	 */
	public double getNumberWrong(){
		return this.numberWrong;
	}
	
	/**
	 * Gets your score on the exam.
	 * @return score
	 */
	public double getScore(){
		return this.score;
	}
	
	/**
	 * Sets the number of points Possible.
	 * @param pointsPossible
	 */
	public void setPointsPossible(double pointsPossible){
		this.pointsPossible = pointsPossible;
	}
	
	/**
	 * Sets the number of points received.
	 * @param pointsReceived
	 */
	public void setPointsReceived(double pointsReceived){
		this.pointsReceived = pointsReceived;
	}
	
	/**
	 * Sets the number of points missed.
	 * @param numberWrong
	 */
	public void setNumberWrong(double numberWrong){
		this.numberWrong = numberWrong;
	}
	
	/**
	 * Sets the score on the exam. 
	 * @param score
	 */
	public void setScore(double score){
		this.score = score;
	}
}
