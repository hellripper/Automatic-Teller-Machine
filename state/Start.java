package state;

import mdaefsm.MDAEFSM;

public class Start extends State {

	public Start(MDAEFSM mda) {
		super(mda);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Open() {
		// TODO Auto-generated method stub
		op.StoreData();
		p.changeState(1);
	}

	@Override
	public void Login() {
		// TODO Auto-generated method stub

	}

	@Override
	public void IncorrectLogin() {
		// TODO Auto-generated method stub

	}

	@Override
	public void IncorectPin(int Max) {
		// TODO Auto-generated method stub

	}

	@Override
	public void CorrectPinBelowMin() {
		// TODO Auto-generated method stub

	}

	@Override
	public void CorrectPinAboveMin() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Deposit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void BelowMinBalance() {
		// TODO Auto-generated method stub

	}

	@Override
	public void AboveMinBalance() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Logout() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Balance() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Withdraw() {
		// TODO Auto-generated method stub

	}

	@Override
	public void WithdrawBelowMinBalance() {
		// TODO Auto-generated method stub

	}

	@Override
	public void NoFunds() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Lock() {
		// TODO Auto-generated method stub

	}

	@Override
	public void IncorrectLock() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Unlock() {
		// TODO Auto-generated method stub

	}

	@Override
	public void IncorrectUnlock() {
		// TODO Auto-generated method stub

	}

	@Override
	public void suspend() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Activate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

}
