class TestMain{
	public static void main(String[] args){
	SaveAcc4HDFCIntf acc1=new SavingAcc();
	acc1.withdrawByCheque();
	
	SaveAcc4PAYTMIntf acc2=new SavingAcc();
	acc2.withdrawByUpi();

}

}
