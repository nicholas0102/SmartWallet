
package com.nicholas.smartwallet.model;

import android.content.Context;
import co.juliansuarez.libwizardpager.wizard.model.AbstractWizardModel;
import co.juliansuarez.libwizardpager.wizard.model.BranchPage;
import co.juliansuarez.libwizardpager.wizard.model.CustomerInfoPage;
import co.juliansuarez.libwizardpager.wizard.model.MultipleFixedChoicePage;
import co.juliansuarez.libwizardpager.wizard.model.NumberPage;
import co.juliansuarez.libwizardpager.wizard.model.PageList;
import co.juliansuarez.libwizardpager.wizard.model.SingleFixedChoicePage;
import co.juliansuarez.libwizardpager.wizard.model.TextPage;

public class TransactionWizardModel extends AbstractWizardModel {
	public TransactionWizardModel(Context context) {
		super(context);
	}

	@Override
	protected PageList onNewRootPageList() {
		return new PageList(new BranchPage(this, "Transaction Type").addBranch(
				"Incoming",
				new SingleFixedChoicePage(this, "Account").setChoices("Cash 1",
						"Cash 2", "Master Card", "POSB Bank", "Personal Savings","Emergency")
						.setRequired(true))
		.addBranch(
				"Outgoing",
				new SingleFixedChoicePage(this, "Account").setChoices("Cash 1",
						"Cash 2", "Master Card", "POSB Bank", "Personal Savings","Emergency")
						.setRequired(true),				
				new SingleFixedChoicePage(this, "Payee").setChoices(
						"Nicholas", "Peng Fei", "Shiqi")
						.setRequired(true),		
				new NumberPage(this, "Amount").setRequired(true)),
				new TextPage(this, "Comments"));
	}
}