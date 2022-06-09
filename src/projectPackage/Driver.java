package projectPackage;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Driver extends Application {
	@Override
	public void start(Stage mainStage) throws FileNotFoundException {
// in this method i called the start method and in every method i called the needed method 
		startScene(mainStage);

	}

	private void startScene(Stage mainStage) throws FileNotFoundException {
// declaring 
		BorderPane bp = new BorderPane();
		Scene scene = new Scene(bp, 500, 500);
		VBox vbox = new VBox();
		vbox.setAlignment(Pos.CENTER_LEFT);
		vbox.setLayoutX(10);
		vbox.setSpacing(20);

		// creating Images for ImageView
		Image customerIcon = new Image(new FileInputStream("audience.png"));
		Image mediaIcon = new Image(new FileInputStream("play-button.png"));
		Image rentIcon = new Image(new FileInputStream("rent.png"));

		ImageView customerView = new ImageView(customerIcon);
		customerView.setFitHeight(100);
		customerView.setFitWidth(100);
		ImageView media = new ImageView(mediaIcon);
		media.setFitHeight(100);
		media.setFitWidth(100);
		
		ImageView rent = new ImageView(rentIcon);
		rent.setFitHeight(100);
		rent.setFitWidth(100);
		Button customer = new Button("Customers", customerView);
		customer.setPrefSize(250, 100);
		Button mediaButton = new Button("Media", media);
		mediaButton.setPrefSize(250, 100);
		Button rentButton = new Button("Rent", rent);
		rentButton.setPrefSize(250, 100);

		// GIVING ACTIONS AREA
		customer.setOnAction(e -> {
			try {
				customerScene(mainStage);
			} catch (FileNotFoundException e1) {

			}
		});
		mediaButton.setOnAction(e -> {
			try {
				mediaScene(mainStage);
			} catch (FileNotFoundException e1) {

			}

		});
		rentButton.setOnAction(e -> {

			try {
				rentScene(mainStage);
				mainStage.setMaximized(true);
			} catch (FileNotFoundException e1) {

			}

		});

		// FINISHED ACTIONS

		vbox.getChildren().addAll(customer, mediaButton, rentButton);

		GridPane grid = new GridPane();
		// adding background photos to buttons
		Image game = new Image(new FileInputStream("console.png"));
		Image forRent = new Image(new FileInputStream("for_rent.png"));
		Image movie = new Image(new FileInputStream("movie.png"));
		Image album = new Image(new FileInputStream("music_album.png"));

		ImageView gamelogo = new ImageView(game);
		ImageView movieLogo = new ImageView(movie);
		ImageView albumLogo = new ImageView(album);
		ImageView rentLogo = new ImageView(forRent);
		grid.setVgap(10);
		grid.setHgap(10);

		gamelogo.setFitHeight(200);
		gamelogo.setFitWidth(200);
		movieLogo.setFitHeight(200);
		movieLogo.setFitWidth(200);
		albumLogo.setFitHeight(200);
		albumLogo.setFitWidth(200);
		rentLogo.setFitHeight(200);
		rentLogo.setFitWidth(200);

		Label label = new Label("Jabra Rental Manager");
		label.setAlignment(Pos.BOTTOM_CENTER);
		label.setFont(new Font("font", 30));

		grid.add(gamelogo, 0, 0);
		grid.add(movieLogo, 1, 0);
		grid.add(albumLogo, 0, 1);
		grid.add(rentLogo, 1, 1);
		grid.setAlignment(Pos.CENTER);
		grid.add(label, 0, 2);
		bp.setCenter(grid);

		mainStage.setMaximized(true);

		bp.setLeft(vbox);

		mainStage.setScene(scene);
		mainStage.setTitle("JABRA Rental Manager");
		mainStage.show();

	}

	private void customerScene(Stage mainStage) throws FileNotFoundException {

		// DECLARING IMAGES & IMAGE VIEW
		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(10));

		Image deleteIcon = new Image(new FileInputStream("delete.png"));
		Image updateIcon = new Image(new FileInputStream("update.png"));
		Image searchIcon = new Image(new FileInputStream("search-user.png"));
		Image backIcon = new Image(new FileInputStream("back.png"));
		Image addIcon = new Image(new FileInputStream("add-group.png"));
		Image infoIcon = new Image(new FileInputStream("info.png"));

		ImageView infoView = new ImageView(infoIcon);
		// to make the image fits good
		infoView.setFitWidth(100);
		infoView.setFitHeight(100);

		ImageView deleteView = new ImageView(deleteIcon);
		// to make the image fits good
		deleteView.setFitWidth(100);
		deleteView.setFitHeight(100);
		ImageView searchView = new ImageView(searchIcon);
		// to make the image fits good
		searchView.setFitWidth(100);
		searchView.setFitHeight(100);
		ImageView updateView = new ImageView(updateIcon);
		// to make the image fits good
		updateView.setFitWidth(100);
		updateView.setFitHeight(100);
		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(100);
		backView.setFitHeight(100);
		ImageView addView = new ImageView(addIcon);
		// to make the image fits good
		addView.setFitWidth(100);
		addView.setFitHeight(100);
		// DECLARING BUTTONS AND ADDING ImageView to them

		Button deleteCustomer = new Button("", deleteView);
		Button updateCustomer = new Button("", updateView);
		Button searchCustomer = new Button("", searchView);
		Button back = new Button("", backView);
		Button addCustomer = new Button("", addView);
		Button customersInfo = new Button("", infoView);

		// Size changing methods
		addCustomer.setPrefSize(500, 200);
		deleteCustomer.setPrefSize(500, 200);
		updateCustomer.setPrefSize(500, 200);
		searchCustomer.setPrefSize(500, 200);
		back.setPrefSize(500, 100);
		customersInfo.setPrefSize(500, 200);

		// Declaring Grid to Add the buttons in
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER); // TO MAKE IT IN CENTRE
		grid.setVgap(10);
		grid.setHgap(10);
		grid.add(addCustomer, 0, 0);
		grid.add(deleteCustomer, 1, 0);
		grid.add(updateCustomer, 0, 1);
		grid.add(searchCustomer, 1, 1);
		grid.add(customersInfo, 2, 0);
		grid.setPadding(new Insets(10));

		// //Declaring FlowPane to add the back button on right alone
		FlowPane flow = new FlowPane();
		flow.getChildren().add(back);
		flow.setAlignment(Pos.CENTER_RIGHT);
		// grid.add(back, 1, 2);

		pane.setCenter(grid);
		pane.setRight(flow);
		Scene scene = new Scene(pane, 500, 500);

		// Making Buttons On Action Using Lambda method to handle the events
		back.setOnAction(e -> {
			try {
				startScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen
			} catch (FileNotFoundException e1) {

			}
		});
		addCustomer.setOnAction(e -> {
			try {
				addCustomerScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen
			} catch (FileNotFoundException e1) {

			}
		});
		deleteCustomer.setOnAction(e -> {
			try {
				// deleteCustomerScene(mainStage);
				// deleteCustomerScene(mainStage);
				deleteCustomerCheckerScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen
			} catch (FileNotFoundException e1) {

			}
		});

		searchCustomer.setOnAction(e -> {
			try {
				searchCustomerScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen
			} catch (FileNotFoundException e1) {

			}

		});

		updateCustomer.setOnAction(e -> {
			try {
				updateCustomerCheckerScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}
		});
		customersInfo.setOnAction(e -> {
			try {
				printAllCustomers(mainStage);
				mainStage.setMaximized(true);
			} catch (FileNotFoundException e1) {

			}
		});

		mainStage.setTitle("Customer Scene");
		mainStage.setScene(scene);
		mainStage.setMaximized(true);
		mainStage.show();

	}

	private void searchCustomerScene(Stage mainStage) throws FileNotFoundException {
		// Declaring Labels & font size & labelWidth
		Label idLabel = new Label("Customer ID : ");
		idLabel.setFont(new Font("font", 40)); // to make font Bigger
		idLabel.setMinWidth(300);

		Label nameLabel = new Label("Customer Name : ");
		nameLabel.setFont(new Font("font", 40));
		nameLabel.setMinWidth(300);

		Label addressLabel = new Label("Customer Address : ");
		addressLabel.setFont(new Font("font", 40));
		addressLabel.setMinWidth(350);

		Label mobileLabel = new Label("Customer Mobile : ");
		mobileLabel.setFont(new Font("font", 40));
		mobileLabel.setMinWidth(350);

		Label planLabel = new Label("Customer Plan : ");
		planLabel.setFont(new Font("font", 40));
		planLabel.setMinWidth(350);
		Label limitedLabel = new Label("If Limited (available limit)  :  ");
		limitedLabel.setFont(new Font(30));
		limitedLabel.setMinWidth(350);
		Label processLabel = new Label("");
		processLabel.setFont(new Font(30));
		processLabel.setMinWidth(350);
		processLabel.setTextFill(Color.RED);

		// Declaring TextFields
		TextField limitedField = new TextField();
		limitedField.setPrefSize(300, 25);
		limitedField.setEditable(false);
		TextField planField = new TextField();
		planField.setPrefSize(300, 25);
		planField.setEditable(false);

		TextField idText = new TextField();
		idText.setPrefSize(300, 25);
		idText.setText(null);

		TextField nameText = new TextField();
		nameText.setPrefSize(300, 25);
		nameText.setEditable(false);
		TextField addressText = new TextField();
		addressText.setPrefSize(300, 25);
		addressText.setEditable(false);
		TextField mobileText = new TextField();
		mobileText.setPrefSize(300, 25);
		mobileText.setEditable(false);

		Image backIcon = new Image(new FileInputStream("back.png"));
		Image searchIcon = new Image(new FileInputStream("search.png"));
		Image homeIcon = new Image(new FileInputStream("home.png"));

		ImageView homeView = new ImageView(homeIcon);
		// to make the image fits good
		homeView.setFitWidth(100);
		homeView.setFitHeight(100);

		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(100);
		backView.setFitHeight(100);

		ImageView searchView = new ImageView(searchIcon);
		// to make the image fits good
		searchView.setFitWidth(100);
		searchView.setFitHeight(100);

		Button back = new Button("", backView);
		Button search = new Button("", searchView);
		Button home = new Button("", homeView);

		back.setOnAction(e -> {
			try {
				customerScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		home.setOnAction(e -> {
			try {
				startScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		idText.setOnKeyTyped(e -> {
			try {
				if (!isInteger(idText.getText().trim())) {
					idText.setText(null);

				}

			} catch (NullPointerException e2) {

			}
		});
		search.setOnAction(e -> {

			try {
				int d = -404; // checker
				for (int i = 0; i < m.customers.size(); i++) {
					if (m.customers.get(i).getID().equalsIgnoreCase(idText.getText().trim())) {
						d = i;
					}
					if (d != -404) {
						if (isInteger(idText.getText().trim()))
							searchCustomerButton(idText.getText().trim(), idText, nameText, planField, limitedField,
									addressText, mobileText);
					} else {
						processLabel.setText("Customer Not Found!!");
					}

				}

			} catch (NullPointerException e2) {
				processLabel.setText("PLEASE ENTER A VALID ID!!");
			}
		});

		HBox box = new HBox();
		box.setSpacing(100);
		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(search, home, back);

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(50));

		pane.setBottom(box);
		GridPane grid = new GridPane();
		grid.setVgap(10);
		grid.setHgap(10);

		grid.add(idLabel, 0, 0);
		grid.add(idText, 8, 0);
		grid.add(nameLabel, 0, 2);
		grid.add(nameText, 8, 2);
		grid.add(planLabel, 0, 4);
		grid.add(planField, 8, 4);
		grid.add(limitedLabel, 0, 6);
		grid.add(limitedField, 8, 6);
		grid.add(mobileLabel, 0, 8);
		grid.add(mobileText, 8, 8);
		grid.add(addressLabel, 0, 10);
		grid.add(addressText, 8, 10);
		grid.add(processLabel, 8, 12);

		grid.setAlignment(Pos.CENTER);
		pane.setCenter(grid);

		Scene scene = new Scene(pane, 500, 500);
		mainStage.setTitle("Search Customer Page");
		mainStage.setScene(scene);
		mainStage.setMaximized(true);
		mainStage.show();

	}

	private void addCustomerScene(Stage mainStage) throws FileNotFoundException {

		// Declaring Labels & font size & labelWidth
		Label idLabel = new Label("Customer ID : ");
		idLabel.setFont(new Font("font", 40)); // to make font Bigger
		idLabel.setMinWidth(300);

		Label nameLabel = new Label("Customer Name : ");
		nameLabel.setFont(new Font("font", 40));
		nameLabel.setMinWidth(300);

		Label addressLabel = new Label("Customer Address : ");
		addressLabel.setFont(new Font("font", 40));
		addressLabel.setMinWidth(350);

		Label mobileLabel = new Label("Customer Mobile : ");
		mobileLabel.setFont(new Font("font", 40));
		mobileLabel.setMinWidth(350);

		Label planLabel = new Label("Customer Plan : ");
		planLabel.setFont(new Font("font", 40));
		planLabel.setMinWidth(350);

		Label limitedLabel = new Label("IF LIMITED (OPTIONAL)  : ");
		limitedLabel.setFont(new Font(30));
		limitedLabel.setMinWidth(350);

		Label processLabel = new Label("");
		processLabel.setFont(new Font(30));
		processLabel.setMinWidth(350);
		processLabel.setTextFill(Color.RED);

		// Declaring TextFields
		TextField limitedField = new TextField();
		limitedField.setPrefSize(300, 25);
		limitedField.setPromptText("Please enter an integer value");
		limitedField.setEditable(false);

		TextField idText = new TextField();
		idText.setPrefSize(300, 25);
		idText.setPromptText("Please enter an integer value");
		idText.setText(null);
		TextField nameText = new TextField();
		nameText.setPrefSize(300, 25);
		nameText.setEditable(false);
		TextField addressText = new TextField();
		addressText.setPrefSize(300, 25);
		addressText.setEditable(false);
		TextField mobileText = new TextField();
		mobileText.setPrefSize(300, 25);
		mobileText.setPromptText("Please enter an integer value");
		mobileText.setEditable(false);

		ComboBox<String> box = new ComboBox<>();
		box.getItems().addAll("Limited", "Unlimited");
		box.setPromptText("----------------- Select Plan ---------------");

		box.setVisible(false);

		Image backIcon = new Image(new FileInputStream("back.png"));
		Image addIcon = new Image(new FileInputStream("add.png"));

		Image homeIcon = new Image(new FileInputStream("home.png"));

		ImageView homeView = new ImageView(homeIcon);
		// to make the image fits good
		homeView.setFitWidth(100);
		homeView.setFitHeight(100);

		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(100);
		backView.setFitHeight(100);
		ImageView addView = new ImageView(addIcon);
		// to make the image fits good
		addView.setFitWidth(100);
		addView.setFitHeight(100);

		Button back = new Button("", backView);
		Button home = new Button("", homeView);
		Button addCustomer = new Button("", addView);

		// lines of code to make text field active and inactive depends to before code
		idText.setOnKeyTyped(e -> {
			try {
				if (isInteger(idText.getText().trim())) {
					nameText.setEditable(true);
					processLabel.setText(null);
				} else {

					idText.setText(null);
					nameText.setText(null);
					processLabel.setText("PLEASE ENTER AN INTEGER VALUE !");

					limitedField.setText(null);
					addressText.setText(null);
					mobileText.setText(null);
					box.setPromptText("----------------- Select Plan ---------------");
					box.setVisible(false);
					limitedField.setVisible(true);
					mobileText.setEditable(false);
					limitedField.setEditable(false);
					addressText.setEditable(false);
					nameText.setEditable(false);

				}
			} catch (NullPointerException e2) {
				processLabel.setText("PLEASE ENTER AN INTEGER for ID VALUE !");

			}

		});
		nameText.setOnKeyTyped(e ->

		{
			try {
				if (!nameText.getText().trim().equalsIgnoreCase(null)) {

					box.setVisible(true);
				} else if (nameText.getText().trim().equalsIgnoreCase("")) {
					addressText.setText(null);
					mobileText.setText(null);
					mobileText.setEditable(false);
					limitedField.setText(null);
					limitedField.setEditable(false);
					limitedField.setVisible(true);
					addressText.setEditable(false);
					box.setPromptText("----------------- Select Plan ---------------");
					box.setVisible(false);

				}

			} catch (NullPointerException e2) {
				addressText.setText(null);
				mobileText.setText(null);
				mobileText.setEditable(false);
				limitedField.setText(null);
				limitedField.setEditable(false);
				limitedField.setVisible(true);
				addressText.setEditable(false);
				box.setPromptText("----------------- Select Plan ---------------");
				box.setVisible(false);
			}
		});
		box.setOnAction(e -> {

			if (box.getValue().trim().equalsIgnoreCase("Unlimited")) {

				limitedField.setEditable(false);
				limitedField.setVisible(false);

				mobileText.setEditable(true);

			}

			else if (box.getValue().trim().equalsIgnoreCase("Limited")) {
				limitedField.setEditable(true);
				limitedField.setVisible(true);

				mobileText.setEditable(false);

			} else {
				limitedField.setEditable(false);
				limitedField.setVisible(false);

				mobileText.setEditable(false);
			}

		});
		limitedField.setOnKeyTyped(e -> {
			try {
				if (!limitedField.getText().equals(null)) {

					if (isInteger(limitedField.getText().trim())) {

						mobileText.setEditable(true);
						processLabel.setText(null);
					}

					else {
						limitedField.setText(null);
						addressText.setText(null);
						mobileText.setText(null);
						mobileText.setEditable(false);
						addressText.setEditable(false);
						processLabel.setText("Please enter an integer value for limited field!!");

					}

				}

			} catch (NullPointerException e2) {
				// TODO: handle exception
			}
		});

		mobileText.setOnKeyTyped(e -> {
			try {
				if (isInteger(mobileText.getText().trim())) {

					addressText.setEditable(true);
					processLabel.setText(null);
				} else {
					mobileText.setText(null);
					addressText.setText(null);
					addressText.setEditable(false);
					processLabel.setText("Please enter an integer value for mobile field");

				}

			} catch (NullPointerException e2) {

			}

		});
		addressText.setOnKeyTyped(e -> {
			try {
				if (addressText.equals(null)) {

					addressText.setText(null);

				}

			} catch (NullPointerException e2) {

			}

		});

		back.setOnAction(e -> {
			try {
				customerScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		home.setOnAction(e -> {
			try {
				startScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		addCustomer.setOnAction(e -> {

			try {
				if (!idText.getText().equals(null) && !nameText.getText().equals(null)
						&& !addressText.getText().equals(null) && !mobileText.getText().equals(null)) {
					String id = idText.getText().trim();
					String name = nameText.getText().trim();
					String address = addressText.getText().trim();
					String mobile = mobileText.getText().trim();

					int d = -404;// checker
					for (int i = 0; i < m.customers.size(); i++) {
						if (m.customers.get(i).getID().equalsIgnoreCase(idText.getText().trim()))
							d = i;
					}
					if (d == -404) {

						if (isInteger(idText.getText().trim()) && isInteger(mobileText.getText().trim())) {
							addingCustomerProgram(name, address, box.getValue().trim(), id, mobile,
									limitedField.getText().trim());
							processLabel.setText("Customer Added successfully !");

						} else {
							mobileText.setText(null);
							idText.setText(null);
							nameText.setText(null);
							limitedField.setText(null);
							addressText.setText(null);
							mobileText.setText(null);
							box.setValue("----------------- Select Plan ---------------");
							box.setVisible(false);
							mobileText.setEditable(false);
							limitedField.setEditable(false);
							addressText.setEditable(false);
							nameText.setEditable(false);
							processLabel.setText("PLEASE FILL ALL FIELDS!!");

						}

					} else {
						processLabel.setText("CUSTOMER ID IS TAKEN!!");

					}
				}
			} catch (NullPointerException e2) {
				processLabel.setText("PLEASE FILL THE FIELDS!!");

			}

		});

		HBox hBox = new HBox();
		hBox.setSpacing(100);
		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().addAll(addCustomer, home, back);

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(50));

		pane.setBottom(hBox);
		GridPane grid = new GridPane();
		grid.setVgap(10);
		grid.setHgap(10);

		grid.add(idLabel, 0, 0);
		grid.add(idText, 8, 0);
		grid.add(nameLabel, 0, 2);
		grid.add(nameText, 8, 2);
		grid.add(planLabel, 0, 4);
		grid.add(box, 8, 4);
		grid.add(limitedLabel, 0, 6);
		grid.add(limitedField, 8, 6);
		grid.add(mobileLabel, 0, 8);
		grid.add(mobileText, 8, 8);
		grid.add(addressLabel, 0, 10);
		grid.add(addressText, 8, 10);
		grid.add(processLabel, 8, 12);

		grid.setAlignment(Pos.CENTER);
		pane.setCenter(grid);

		Scene scene = new Scene(pane, 500, 500);
		mainStage.setTitle("Add Customer Page");
		mainStage.setScene(scene);
		mainStage.setMaximized(true);
		mainStage.show();

	}

	private void deleteCustomerScene(Stage mainStage, String id, String name, String plan, String limited,
			String address, String mobile) throws FileNotFoundException {

		// Declaring Labels & font size & labelWidth
		Label idLabel = new Label("Customer ID : ");
		idLabel.setFont(new Font("font", 40)); // to make font Bigger
		idLabel.setMinWidth(300);

		Label nameLabel = new Label("Customer Name : ");
		nameLabel.setFont(new Font("font", 40));
		nameLabel.setMinWidth(300);

		Label addressLabel = new Label("Customer Address : ");
		addressLabel.setFont(new Font("font", 40));
		addressLabel.setMinWidth(350);

		Label mobileLabel = new Label("Customer Mobile : ");
		mobileLabel.setFont(new Font("font", 40));
		mobileLabel.setMinWidth(350);

		Label planLabel = new Label("Customer Plan : ");
		planLabel.setFont(new Font("font", 40));
		planLabel.setMinWidth(350);
		Label limitedLabel = new Label("If Limited (available limit)  : ");
		limitedLabel.setFont(new Font(30));
		limitedLabel.setMinWidth(350);
		Label processLabel = new Label("");
		processLabel.setFont(new Font(30));
		processLabel.setTextFill(Color.RED);
		processLabel.setMinWidth(100);
		// loop to get Values of customer

		// Declaring TextFields

		TextField planField = new TextField();
		planField.setPrefSize(300, 25);
		planField.setText(plan);

		planField.setEditable(false);

		TextField limitedField = new TextField();
		limitedField.setPrefSize(300, 25);
		if (plan.equalsIgnoreCase("limited")) {
			limitedField.setText(limited);
		} else {
			limitedField.setText("UNLIMITED PLAN APPLIED");

		}

		limitedField.setEditable(false);

		TextField idText = new TextField();
		idText.setPrefSize(300, 25);
		idText.setText(id);
		idText.setEditable(false);

		TextField nameText = new TextField();
		nameText.setPrefSize(300, 25);
		nameText.setText(name);
		nameText.setEditable(false);
		TextField addressText = new TextField();
		addressText.setPrefSize(300, 25);
		addressText.setText(address);
		addressText.setEditable(false);
		TextField mobileText = new TextField();
		mobileText.setPrefSize(300, 25);
		mobileText.setText(mobile);
		mobileText.setEditable(false);

		Image backIcon = new Image(new FileInputStream("back.png"));
		Image deleteIcon = new Image(new FileInputStream("delete.png"));
		Image homeIcon = new Image(new FileInputStream("home.png"));

		// to make the image fits good

		ImageView homeView = new ImageView(homeIcon);
		// to make the image fits good
		homeView.setFitWidth(100);
		homeView.setFitHeight(100);
		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(100);
		backView.setFitHeight(100);
		ImageView deleteView = new ImageView(deleteIcon);
		// to make the image fits good
		deleteView.setFitWidth(100);
		deleteView.setFitHeight(100);

		Button back = new Button("", backView);
		Button deleteCustomer = new Button("", deleteView);
		Button home = new Button("", homeView);

		HBox hBox = new HBox();
		hBox.setSpacing(100);
		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().addAll(deleteCustomer, home, back);

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(30));

		pane.setBottom(hBox);
		GridPane grid = new GridPane();
		grid.setVgap(10);
		grid.setHgap(10);

		grid.add(idLabel, 0, 0);
		grid.add(idText, 8, 0);
		grid.add(nameLabel, 0, 2);
		grid.add(nameText, 8, 2);
		grid.add(planLabel, 0, 4);
		grid.add(planField, 8, 4);
		grid.add(limitedLabel, 0, 6);
		grid.add(limitedField, 8, 6);
		grid.add(mobileLabel, 0, 8);
		grid.add(mobileText, 8, 8);
		grid.add(addressLabel, 0, 10);
		grid.add(addressText, 8, 10);
		grid.add(processLabel, 8, 12);
		grid.setAlignment(Pos.CENTER);
		pane.setCenter(grid);

		// BUTTONS ACTIONS

		back.setOnAction(e -> {
			try {
				deleteCustomerCheckerScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		home.setOnAction(e -> {
			try {
				startScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});

		deleteCustomer.setOnAction(e -> {

			int d = -404;
			for (int i = 0; i < m.customers.size(); i++) {
				if (m.customers.get(i).getID().equalsIgnoreCase(id)) {
					d = i;
				}

			}
			if (d != -404) {

				for (int j = 0; j < m.customers.get(d).getRented().size(); j++) {
					m.returnMedia(m.customers.get(d).getID(), m.customers.get(d).getRented().get(j).getCode());

				}
				for (int j = 0; j < m.customers.get(d).getInterested().size(); j++) {
					m.returnMedia(m.customers.get(d).getID(), m.customers.get(d).getInterested().get(j));

				}

				m.customers.remove(d);
				try {
					customerRefresh();
					customerLeftRefresh();
					mediaLeftRefresh();
				} catch (IOException e1) {

				}
				processLabel.setText("Deleted SUCCESSFULLY!!");

			}

		});
		//

		Scene scene = new Scene(pane, 500, 500);
		mainStage.setTitle("Delete Customer Page");
		mainStage.setScene(scene);
		mainStage.setMaximized(true);
		mainStage.show();

	}

	private void updateCustomerCheckerScene(Stage mainStage) throws FileNotFoundException {
		ComboBox<String> comboBox = new ComboBox<>();
		comboBox.setPromptText("--Please select Customer --");

		for (int i = 0; i < m.customers.size(); i++) {
			comboBox.getItems().add(m.customers.get(i).getID() + "  ,  " + m.customers.get(i).getName());

		}
		comboBox.setPrefSize(200, 50);

		Image backIcon = new Image(new FileInputStream("back.png"));
		Image homeIcon = new Image(new FileInputStream("home.png"));

		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(100);
		backView.setFitHeight(100);

		ImageView homeView = new ImageView(homeIcon);
		// to make the image fits good
		homeView.setFitWidth(100);
		homeView.setFitHeight(100);

		Button back = new Button("", backView);
		Button home = new Button("", homeView);
		// BUTTON SIZE CHANGING

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(100)); // to move the nodes out of edge

		GridPane grid = new GridPane();
		grid.setVgap(10);
		grid.setHgap(10);
		grid.add(comboBox, 0, 0);
		grid.setAlignment(Pos.CENTER);

		pane.setCenter(grid);

		HBox box = new HBox();
		box.setSpacing(40);
		box.getChildren().addAll(home, back);

		box.setAlignment(Pos.BOTTOM_CENTER);

		pane.setBottom(box);

		// Action Buttons
		back.setOnAction(e -> {
			try {
				customerScene(mainStage);
				mainStage.setMaximized(true);
			} catch (FileNotFoundException e1) {

			}

		});
		home.setOnAction(e -> {
			try {
				startScene(mainStage);
				mainStage.setMaximized(true);
			} catch (FileNotFoundException e1) {

			}

		});
		comboBox.setOnAction(e -> {
			String string = comboBox.getValue();
			String[] array = string.split(",");
			if (array.length == 2) {

				int d = -404; // checker
				for (int i = 0; i < m.customers.size(); i++) {
					if (m.customers.get(i).getID().equalsIgnoreCase(array[0].trim()))
						d = i;

				}
				if (d != -404) {
					Customer customer = m.customers.get(d);
					try {
						if (customer.getPlan().equalsIgnoreCase("limited")) {
							updateCustomerScene(mainStage, customer.getID(), customer.getName(), customer.getPlan(),
									Integer.toString(customer.getLimited()), customer.getAddress(),
									customer.getMobileNumber());
						}

						else {
							updateCustomerScene(mainStage, customer.getID(), customer.getName(), customer.getPlan(),
									"UNLIMITED PLAN APPLIED", customer.getAddress(), customer.getMobileNumber());
						}
					} catch (FileNotFoundException e1) {

					}

				}

			}

		});

		Scene scene = new Scene(pane, 300, 500);
		mainStage.setMaximized(true);
		mainStage.setTitle("Customer Checker ");
		mainStage.setScene(scene);
		mainStage.show();

	}

	private void deleteCustomerCheckerScene(Stage mainStage) throws FileNotFoundException {
		ComboBox<String> comboBox = new ComboBox<>();
		comboBox.setPromptText("--Please select Customer --");

		for (int i = 0; i < m.customers.size(); i++) {
			comboBox.getItems().add(m.customers.get(i).getID() + "  ,  " + m.customers.get(i).getName());

		}
		comboBox.setPrefSize(200, 50);

		Image backIcon = new Image(new FileInputStream("back.png"));
		Image homeIcon = new Image(new FileInputStream("home.png"));

		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(100);
		backView.setFitHeight(100);

		ImageView homeView = new ImageView(homeIcon);
		// to make the image fits good
		homeView.setFitWidth(100);
		homeView.setFitHeight(100);

		Button back = new Button("", backView);
		Button home = new Button("", homeView);
		// BUTTON SIZE CHANGING

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(100)); // to move the nodes out of edge

		GridPane grid = new GridPane();
		grid.setVgap(10);
		grid.setHgap(10);
		grid.add(comboBox, 0, 0);
		grid.setAlignment(Pos.CENTER);

		pane.setCenter(grid);

		HBox box = new HBox();
		box.setSpacing(40);
		box.getChildren().addAll(home, back);

		box.setAlignment(Pos.BOTTOM_CENTER);

		pane.setBottom(box);

		// Action Buttons
		back.setOnAction(e -> {
			try {
				customerScene(mainStage);
				mainStage.setMaximized(true);
			} catch (FileNotFoundException e1) {

			}

		});
		home.setOnAction(e -> {
			try {
				startScene(mainStage);
				mainStage.setMaximized(true);
			} catch (FileNotFoundException e1) {

			}

		});
		comboBox.setOnAction(e -> {
			String string = comboBox.getValue();
			String[] array = string.split(",");
			if (array.length == 2) {

				int d = -404; // checker
				for (int i = 0; i < m.customers.size(); i++) {
					if (m.customers.get(i).getID().equalsIgnoreCase(array[0].trim()))
						d = i;

				}
				if (d != -404) {
					Customer customer = m.customers.get(d);
					try {
						deleteCustomerScene(mainStage, customer.getID(), customer.getName(), customer.getPlan(),
								Integer.toString(customer.getLimited()), customer.getAddress(),
								customer.getMobileNumber());
					} catch (FileNotFoundException e1) {

					}

				}

			}

		});

		Scene scene = new Scene(pane, 300, 500);
		mainStage.setMaximized(true);
		mainStage.setTitle("Customer Checker ");
		mainStage.setScene(scene);
		mainStage.show();

	}

	private void updateCustomerScene(Stage mainStage, String id, String name, String plan, String limited,
			String address, String mobile) throws FileNotFoundException {
		// Declaring Labels & font size & labelWidth
		Label idLabel = new Label("Customer ID : ");
		idLabel.setFont(new Font("font", 40)); // to make font Bigger
		idLabel.setMinWidth(300);

		Label nameLabel = new Label("Customer Name : ");
		nameLabel.setFont(new Font("font", 40));
		nameLabel.setMinWidth(300);

		Label addressLabel = new Label("Customer Address : ");
		addressLabel.setFont(new Font("font", 40));
		addressLabel.setMinWidth(350);

		Label mobileLabel = new Label("Customer Mobile : ");
		mobileLabel.setFont(new Font("font", 40));
		mobileLabel.setMinWidth(350);

		Label planLabel = new Label("Customer Plan : ");
		planLabel.setFont(new Font("font", 40));
		planLabel.setMinWidth(350);

		Label limitedLabel = new Label("If Limited (available limit) : ");
		limitedLabel.setFont(new Font(30));
		limitedLabel.setMinWidth(350);
		Label processLabel = new Label();
		processLabel.setFont(new Font(30));
		processLabel.setMinWidth(350);
		processLabel.setTextFill(Color.RED);

		// Declaring TextFields
		TextField limitedField = new TextField();
		limitedField.setPrefSize(300, 25);
		limitedField.setText(limited);
		limitedField.setVisible(false);

		TextField idText = new TextField();
		idText.setPrefSize(300, 25);
		idText.setText(id);
		idText.setEditable(false);
		TextField nameText = new TextField();
		nameText.setPrefSize(300, 25);
		nameText.setText(name);
		TextField addressText = new TextField();
		addressText.setPrefSize(300, 25);
		addressText.setText(address);
		TextField mobileText = new TextField();
		mobileText.setPrefSize(300, 25);
		mobileText.setText(mobile);

		Image backIcon = new Image(new FileInputStream("back.png"));
		Image updateIcon = new Image(new FileInputStream("refresh.png"));
		Image homeIcon = new Image(new FileInputStream("home.png"));

		ImageView homeView = new ImageView(homeIcon);
		// to make the image fits good
		homeView.setFitWidth(100);
		homeView.setFitHeight(100);
		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(100);
		backView.setFitHeight(100);

		ImageView updateView = new ImageView(updateIcon);
		// to make the image fits good
		updateView.setFitWidth(100);
		updateView.setFitHeight(100);

		Button back = new Button("", backView);
		Button home = new Button("", homeView);
		Button updateCustomer = new Button("", updateView);
		ComboBox<String> box = new ComboBox<>();
		box.getItems().addAll("Limited", "Unlimited");

		if (plan.equalsIgnoreCase("limited")) {
			box.setValue("Limited");

			limitedField.setVisible(true);

		} else if (plan.equalsIgnoreCase("unlimited")) {
			box.setValue("Unlimited");
			limitedField.setText(null);
			limitedField.setEditable(false);
			limitedField.setVisible(false);

		}
		box.setOnAction(e -> {
			if (box.getValue().trim().equalsIgnoreCase("LIMITED")) {

				limitedField.setEditable(true);
				limitedField.setVisible(true);
			} else if (box.getValue().trim().equalsIgnoreCase("unlimited")) {
				limitedField.setText(null);
				limitedField.setEditable(false);
				limitedField.setVisible(false);

			}
		});

		back.setOnAction(e -> {
			try {
				updateCustomerCheckerScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		home.setOnAction(e -> {
			try {
				startScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});

		updateCustomer.setOnAction(e -> {

			try {
				if (!idText.getText().equals(null) && !nameText.getText().equals(null)
						&& !addressText.getText().equals(null) && isInteger(mobileText.getText().trim())) {

					int d = -404; // checker
					for (int i = 0; i < m.customers.size(); i++) {
						if (m.customers.get(i).getID().equalsIgnoreCase(id))
							d = i;
					}
					if (d != -404) {
						Customer customer = m.customers.get(d);
						customer.setName(nameText.getText());
						customer.setPlan(box.getValue().trim());
						customer.setAddress(addressText.getText().trim());
						if (box.getValue().trim().equalsIgnoreCase("limited")) {
							try {
								if (isInteger(limitedField.getText().trim())) {
									customer.setLimited(Integer.parseInt(limitedField.getText()));

								}
							} catch (NullPointerException e2) {
								customer.setLimited(2);
								limitedField.setText("2");
							}

						}

						try {
							if (isInteger(mobileText.getText().trim())) {
								customer.setMobileNumber(mobileText.getText());
							} else {
								mobileText.setText(null);

							}
						} catch (NullPointerException e2) {
							// TODO: handle exception
						}

						processLabel.setText("CUSTOMER UPDATED!!");

					}

					try {
						customerRefresh();
						customerLeftRefresh();
						rentedFile();
						intrestedFile();
					} catch (IOException e1) {

					}
				} else {

				}
			} catch (NullPointerException e2) {
				processLabel.setText("UPDATE FAILED!!");
			}

		});

		limitedField.setOnKeyTyped(e ->

		{

			try {

				if (box.getValue().equalsIgnoreCase("Limited")) {
					if (!isInteger(limitedField.getText().trim())) {
						limitedField.setText(null);
						processLabel.setText("PLEASE ENTER A VALUE FOR LIMITED ! !");

					} else {

						processLabel.setText("");

					}

				}
			} catch (NullPointerException e2) {
				processLabel.setText("PLEASE ENTER A VALID LIMITED VALUE !");
			}

		});

		mobileText.setOnKeyTyped(e ->

		{
			try {
				if (!isInteger(mobileText.getText().trim())) {

					mobileText.setText(null);
					processLabel.setText("PLEASE ENTER A VALID VALUE FOR LIMITED ! !");

				} else {
					processLabel.setText("");

				}

			} catch (NullPointerException e2) {
				processLabel.setText("PLEASE ENTER A VALUE FOR LIMITED ! !");
			}

		});
		nameText.setOnKeyTyped(e -> {
			if (nameText.getText().equalsIgnoreCase("")) {
				nameText.setText(null);

			}
		});

		addressText.setOnKeyTyped(e -> {
			if (addressText.getText().equalsIgnoreCase("")) {
				addressText.setText(null);

			}
		});

		HBox hBox = new HBox();
		hBox.setSpacing(100);
		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().addAll(updateCustomer, home, back);

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(50));

		pane.setBottom(hBox);
		GridPane grid = new GridPane();
		grid.setVgap(10);
		grid.setHgap(10);

		grid.add(idLabel, 0, 0);
		grid.add(idText, 8, 0);
		grid.add(nameLabel, 0, 2);
		grid.add(nameText, 8, 2);
		grid.add(planLabel, 0, 4);
		grid.add(box, 8, 4);
		grid.add(limitedLabel, 0, 6);
		grid.add(limitedField, 8, 6);
		grid.add(mobileLabel, 0, 8);
		grid.add(mobileText, 8, 8);
		grid.add(addressLabel, 0, 10);
		grid.add(addressText, 8, 10);
		grid.add(processLabel, 8, 12);

		grid.setAlignment(Pos.CENTER);
		pane.setCenter(grid);

		Scene scene = new Scene(pane, 500, 500);
		mainStage.setTitle("Update Customer Page");
		mainStage.setScene(scene);
		mainStage.setMaximized(true);
		mainStage.show();

	}

	private void printAllCustomers(Stage mainStage) throws FileNotFoundException {
		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(100)); // to have space from edge
		VBox stack = new VBox();
		HBox hBox = new HBox();
		ComboBox<String> box = new ComboBox<>();
		for (int i = 0; i < m.customers.size(); i++) {
			box.getItems().add(m.customers.get(i).getName() + "  ,  " + m.customers.get(i).getID());

		}
		box.setPromptText("------ Select a customer ------");
		Image backIcon = new Image(new FileInputStream("back.png"));
		Image homeIcon = new Image(new FileInputStream("home.png"));
		Image rentedIcon = new Image(new FileInputStream("RentedItems.png"));
		ImageView homeView = new ImageView(homeIcon);
		// to make the image fits good
		homeView.setFitWidth(100);
		homeView.setFitHeight(100);

		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(100);
		backView.setFitHeight(100);

		Label label = new Label("Customers Information : ");
		label.setFont(new Font(30));

		TextArea text = new TextArea();
		text.setEditable(false);

		Button back = new Button("", backView);
		Button home = new Button("", homeView);
		Button allCustomers = new Button(" All Customers info ");
		Button intrested = new Button("Intrested Items ");
		Button rented = new Button(" Rented Items ");

		stack.getChildren().addAll(label, box, allCustomers, rented, intrested);
		stack.setSpacing(40);
		stack.setAlignment(Pos.CENTER_LEFT);

		hBox.getChildren().addAll(back, home);
		hBox.setSpacing(40);
		hBox.setAlignment(Pos.BOTTOM_LEFT);

		back.setOnAction(e -> {
			try {
				customerScene(mainStage);
				mainStage.setMaximized(true);
			} catch (FileNotFoundException e1) {

			}

		});
		home.setOnAction(e -> {

			try {
				startScene(mainStage);
				mainStage.setMaximized(true);
			} catch (FileNotFoundException e1) {

			}

		});

		box.setOnAction(e -> {

			try {
				text.setText(null);
				String line = box.getValue();
				String[] array = line.split(",");
				String string = "";

				for (int i = 0; i < m.customers.size(); i++) {

					if (m.customers.get(i).getID().equalsIgnoreCase(array[1].trim())) {
						Customer customer = m.customers.get(i);
						if (customer.getPlan().equalsIgnoreCase("limited")) {
							string += '\n' + "Customer ID : " + customer.getID() + " , " + "Customer Name : "
									+ customer.getName() + '\n' + "Customer Plan : " + customer.getPlan() + " , "
									+ "Customer Limit : " + customer.getLimited() + '\n' + "Customer Address : "
									+ customer.getAddress() + " , " + "Customer Mobile : " + customer.getMobileNumber()
									+ '\n';

						} else {
							string += '\n' + "Customer ID : " + customer.getID() + " , " + "Customer Name : "
									+ customer.getName() + '\n' + "Customer Plan : " + customer.getPlan() + '\n'
									+ "Customer Address : " + customer.getAddress() + " , " + "Customer Mobile : "
									+ customer.getMobileNumber() + '\n';
						}
					}

				}

				text.setText(string);
			} catch (NullPointerException e2) {

			}

		});
		allCustomers.setOnAction(e -> {
			text.setText(null);
			String string = "";
			for (int i = 0; i < m.customers.size(); i++) {
				Customer customer = m.customers.get(i);
				if (customer.getPlan().equalsIgnoreCase("limited")) {
					string += '\n' + "Customer ID : " + customer.getID() + " , " + "Customer Name : "
							+ customer.getName() + '\n' + "Customer Plan : " + customer.getPlan() + " , "
							+ "Customer Limit : " + customer.getLimited() + '\n' + "Customer Address : "
							+ customer.getAddress() + " , " + "Customer Mobile : " + customer.getMobileNumber() + '\n';

				} else {
					string += '\n' + "Customer ID : " + customer.getID() + " , " + "Customer Name : "
							+ customer.getName() + '\n' + "Customer Plan : " + customer.getPlan() + '\n'
							+ "Customer Address : " + customer.getAddress() + " , " + "Customer Mobile : "
							+ customer.getMobileNumber() + '\n';
				}

			}
			text.setText(string);
			text.setFont(new Font(20));
		});

		intrested.setOnAction(e -> {
			try {
				text.setText(null);
				String line = box.getValue();
				String[] array = line.split(",");
				String string = "Media Codes :  " + '\n';
				for (int i = 0; i < m.customers.size(); i++) {

					if (m.customers.get(i).getID().equalsIgnoreCase(array[1].trim())) {
						if (m.customers.get(i).getInterested().size() > 0) {

							for (int j = 0; j < m.customers.get(i).getInterested().size(); j++) {

								string += m.customers.get(i).getInterested().get(j).trim() + '\n';

							}

						} else {
							string = " No Intrested items found";
						}
					}

				}
				text.setText(string);
			} catch (NullPointerException e2) {

			}
		});
		rented.setOnAction(e -> {
			try {
				text.setText(null);
				String line = box.getValue();
				String[] array = line.split(",");
				String string = "Media Codes :  " + '\n';
				for (int i = 0; i < m.customers.size(); i++) {

					if (m.customers.get(i).getID().equalsIgnoreCase(array[1].trim())) {
						if (m.customers.get(i).getRented().size() > 0) {

							for (int j = 0; j < m.customers.get(i).getRented().size(); j++) {

								string += m.customers.get(i).getRented().get(j).getCode() + '\n';

							}

						} else {
							string = " No Rented items found";
						}
					}

				}
				text.setText(string);
			} catch (NullPointerException e2) {

			}
		});

		pane.setLeft(stack);
		pane.setCenter(text);
		pane.setBottom(hBox);

		Scene scene = new Scene(pane, 300, 500);
		mainStage.setMaximized(true);
		mainStage.setTitle("Customers Information");
		mainStage.setScene(scene);
		mainStage.show();

	}

	private void mediaScene(Stage mainStage) throws FileNotFoundException {

		// DECLARING IMAGES & IMAGE VIEW
		BorderPane pane = new BorderPane();

		Image deleteIcon = new Image(new FileInputStream("delete.png"));
		Image searchIcon = new Image(new FileInputStream("search.png"));
		Image backIcon = new Image(new FileInputStream("back.png"));
		Image addIcon = new Image(new FileInputStream("add.png"));
		Image printIcon = new Image(new FileInputStream("print.png"));
		Image updateIcon = new Image(new FileInputStream("update.png"));

		ImageView updateView = new ImageView(updateIcon);
		// to make the image fits good
		updateView.setFitWidth(100);
		updateView.setFitHeight(100);

		ImageView deleteView = new ImageView(deleteIcon);
		// to make the image fits good
		deleteView.setFitWidth(100);
		deleteView.setFitHeight(100);

		ImageView printView = new ImageView(printIcon);
		// to make the image fits good
		printView.setFitWidth(100);
		printView.setFitHeight(100);
		ImageView searchView = new ImageView(searchIcon);
		// to make the image fits good
		searchView.setFitWidth(100);
		searchView.setFitHeight(100);

		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(100);
		backView.setFitHeight(100);
		ImageView addView = new ImageView(addIcon);
		// to make the image fits good
		addView.setFitWidth(100);
		addView.setFitHeight(100);
		// DECLARING BUTTONS AND ADDING ImageView to them

		Button deleteMedia = new Button("", deleteView);
		Button printAllMedia = new Button("", printView);
		Button updateMedia = new Button("", updateView);
		Button searchMedia = new Button("", searchView);
		Button back = new Button("", backView);
		Button addMedia = new Button("", addView);

		// Size changing methods
		addMedia.setPrefSize(500, 200);
		deleteMedia.setPrefSize(500, 200);
		updateMedia.setPrefSize(500, 200);
		searchMedia.setPrefSize(500, 200);
		printAllMedia.setPrefSize(500, 200);
		back.setPrefSize(500, 100);

		// Declaring Grid to Add the buttons in
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER); // TO MAKE IT IN CENTRE
		grid.setVgap(10);
		grid.setHgap(10);
		grid.add(addMedia, 0, 0);
		grid.add(deleteMedia, 1, 0);
		grid.add(updateMedia, 0, 1);
		grid.add(searchMedia, 1, 1);
		grid.add(printAllMedia, 0, 2);

		// //Declaring FlowPane to add the back button on right alone
		FlowPane flow = new FlowPane();
		flow.getChildren().add(back);
		flow.setAlignment(Pos.CENTER_RIGHT);
		// grid.add(back, 1, 2);

		// grid.add(back, 1, 2);

		pane.setCenter(grid);
		pane.setRight(flow);

		Scene scene = new Scene(pane, 500, 500);

		// Making Buttons On Action Using Lambda method to handle the events
		back.setOnAction(e -> {
			try {
				startScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen
			} catch (FileNotFoundException e1) {

			}
		});
		addMedia.setOnAction(e -> {
			try {
				addMediaCheckerScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen
			} catch (FileNotFoundException e1) {

			}
		});

		searchMedia.setOnAction(e -> {
			try {
				searchMediaScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen
			} catch (FileNotFoundException e1) {

			}

		});
		printAllMedia.setOnAction(e -> {
			try {
				printAllMedia(mainStage);
				mainStage.setMaximized(true);
			} catch (FileNotFoundException e1) {

			}

		});
		deleteMedia.setOnAction(e -> {
			try {
				deleteMediaChecker(mainStage);
				mainStage.setMaximized(true);
			} catch (FileNotFoundException e1) {

			}
		});
		updateMedia.setOnAction(e -> {
			try {
				updateMediaChecker(mainStage);
				mainStage.setMaximized(true);
			} catch (FileNotFoundException e1) {

			}
		});

		mainStage.setTitle("Media Scene");
		mainStage.setScene(scene);
		mainStage.setMaximized(true);
		mainStage.show();

	}

	private void addMediaCheckerScene(Stage mainStage) throws FileNotFoundException {
		ComboBox<String> comboBox = new ComboBox<>();
		comboBox.setPromptText("--Please select media --");
		comboBox.getItems().addAll("Movie", "Album", "Game");
		comboBox.setPrefSize(200, 50);

		Image backIcon = new Image(new FileInputStream("back.png"));
		Image homeIcon = new Image(new FileInputStream("home.png"));

		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(100);
		backView.setFitHeight(100);

		ImageView homeView = new ImageView(homeIcon);
		// to make the image fits good
		homeView.setFitWidth(100);
		homeView.setFitHeight(100);

		Button back = new Button("", backView);
		Button home = new Button("", homeView);
		// BUTTON SIZE CHANGING

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(100)); // to move the nodes out of edge

		GridPane grid = new GridPane();
		grid.setVgap(10);
		grid.setHgap(10);
		grid.add(comboBox, 0, 0);
		grid.setAlignment(Pos.CENTER);

		pane.setCenter(grid);

		HBox box = new HBox();
		box.setSpacing(40);
		box.getChildren().addAll(home, back);

		box.setAlignment(Pos.BOTTOM_CENTER);

		pane.setBottom(box);

		// Action Buttons
		back.setOnAction(e -> {
			try {
				mediaScene(mainStage);
				mainStage.setMaximized(true);
			} catch (FileNotFoundException e1) {

			}

		});
		home.setOnAction(e -> {
			try {
				startScene(mainStage);
				mainStage.setMaximized(true);
			} catch (FileNotFoundException e1) {

			}

		});

		comboBox.setOnAction(e -> {
			if (comboBox.getValue().equalsIgnoreCase("Movie")) {
				try {
					addMovieScene(mainStage);
				} catch (FileNotFoundException e1) {

				}

			} else if (comboBox.getValue().equalsIgnoreCase("Album")) {
				try {
					addAlbumScene(mainStage);
					mainStage.setMaximized(true);
				} catch (FileNotFoundException e1) {

				}

			} else if (comboBox.getValue().equalsIgnoreCase("Game")) {
				try {
					addGameScene(mainStage);
					mainStage.setMaximized(true);
				} catch (FileNotFoundException e1) {

				}

			}

		});

		Scene scene = new Scene(pane, 300, 500);
		mainStage.setMaximized(true);
		mainStage.setTitle("Checking media ");
		mainStage.setScene(scene);
		mainStage.show();

	}

	private void searchMediaScene(Stage mainStage) throws FileNotFoundException {

		Image backIcon = new Image(new FileInputStream("back.png"));
		Image homeIcon = new Image(new FileInputStream("home.png"));
		Image processIcon = new Image(new FileInputStream("search.png"));

		ImageView processView = new ImageView(processIcon);
		// to make the image fits good
		processView.setFitWidth(80);
		processView.setFitHeight(80);

		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(80);
		backView.setFitHeight(80);

		ImageView homeView = new ImageView(homeIcon);
		// to make the image fits good
		homeView.setFitWidth(80);
		homeView.setFitHeight(80);

		Button back = new Button("", backView);
		Button home = new Button("", homeView);
		Button search = new Button("", processView);
		// DECLARING LABEL
		Label label = new Label("Enter Media Code : ");
		label.setFont(new Font(30));

		// DELARING TEXT FIELD
		TextField mediaCode = new TextField();
		mediaCode.setPrefWidth(400);

		HBox processBox = new HBox();
		processBox.setSpacing(40);
		processBox.getChildren().addAll(search);

		GridPane grid = new GridPane();
		grid.setVgap(20);
		grid.setHgap(10);
		grid.add(label, 0, 0);
		grid.add(mediaCode, 1, 0);
		grid.add(processBox, 1, 2);
		grid.setAlignment(Pos.CENTER);

		HBox box = new HBox();
		box.setSpacing(40);
		box.getChildren().addAll(home, back);

		box.setAlignment(Pos.BOTTOM_CENTER);

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(100)); // to have space from edge

		pane.setBottom(box);

		pane.setCenter(grid);

		// Buttons Action
		back.setOnAction(e -> {
			try {
				mediaScene(mainStage);
				mainStage.setMaximized(true);
			} catch (FileNotFoundException e1) {

			}

		});
		home.setOnAction(e -> {
			try {
				startScene(mainStage);
				mainStage.setMaximized(true);
			} catch (FileNotFoundException e1) {

			}

		});
		search.setOnAction(e -> {
			String code = mediaCode.getText().trim();
			int d = -404; // checker
			for (int i = 0; i < m.media.size(); i++) {
				if (m.media.get(i).getCode().equalsIgnoreCase(code))
					d = i;

			}
			if (d != -404) {
				Media media = m.media.get(d);
				String title = media.getTitle();
				String copies = Integer.toString(media.getNumberOfCopies());

				if (media instanceof Game) {
					try {
						Game game = (Game) media;
						gameInfoScene(mainStage, code, title, copies, Double.toString(game.getWeight()));
						mainStage.setMaximized(true);
					} catch (FileNotFoundException e1) {

					}

				}
				if (media instanceof Album) {
					try {
						Album album = (Album) media;
						albumInfoScene(mainStage, code, title, copies, album.getArtist(), album.getSongs());
						mainStage.setMaximized(true);
					} catch (FileNotFoundException e1) {

					}

				}
				if (media instanceof Movie) {
					try {
						Movie movie = (Movie) media;
						movieInfoScene(mainStage, code, title, copies, movie.getRating());
						mainStage.setMaximized(true);
					} catch (FileNotFoundException e1) {

					}

				}

			}

		});

		Scene scene = new Scene(pane, 300, 500);
		mainStage.setMaximized(true);
		mainStage.setTitle("Media Search ");
		mainStage.setScene(scene);
		mainStage.show();

	}

	private void addGameScene(Stage mainStage) throws FileNotFoundException {

		// Declaring Labels & font size & labelWidth
		Label codeLabel = new Label("Media Code : ");
		codeLabel.setFont(new Font("font", 40)); // to make font Bigger
		codeLabel.setMinWidth(300);

		Label titleLabel = new Label("Game Title : ");
		titleLabel.setFont(new Font("font", 40));
		titleLabel.setMinWidth(300);

		Label numberCopiesLabel = new Label("Number Of Copies : ");
		numberCopiesLabel.setFont(new Font("font", 40));
		numberCopiesLabel.setMinWidth(350);

		Label weightLabel = new Label("Game Weight : ");
		weightLabel.setFont(new Font("font", 40));
		weightLabel.setMinWidth(350);

		Label processLabel = new Label("");
		processLabel.setFont(new Font(30));
		processLabel.setMinWidth(350);
		processLabel.setTextFill(Color.RED);

		// Declaring TextFields
		TextField codeText = new TextField();
		codeText.setPrefSize(300, 25);
		codeText.setText(null);
		TextField titleText = new TextField();
		titleText.setPrefSize(300, 25);
		titleText.setText(null);
		titleText.setEditable(false);
		TextField copiesNumberText = new TextField();
		copiesNumberText.setPrefSize(300, 25);
		copiesNumberText.setText(null);
		copiesNumberText.setEditable(false);
		TextField weightText = new TextField();
		weightText.setPrefSize(300, 25);
		weightText.setText(null);
		weightText.setEditable(false);

		Image backIcon = new Image(new FileInputStream("back.png"));
		Image addIcon = new Image(new FileInputStream("add.png"));
		Image homeIcon = new Image(new FileInputStream("home.png"));

		ImageView homeView = new ImageView(homeIcon);
		// to make the image fits good
		homeView.setFitWidth(100);
		homeView.setFitHeight(100);

		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(100);
		backView.setFitHeight(100);
		ImageView addView = new ImageView(addIcon);
		// to make the image fits good
		addView.setFitWidth(100);
		addView.setFitHeight(100);

		Button back = new Button("", backView);
		Button home = new Button("", homeView);
		Button addGame = new Button("", addView);

		// lines of code to make text field active and inactive depends to before code
		codeText.setOnKeyTyped(e -> {
			try {
				if (!codeText.getText().trim().equalsIgnoreCase(""))
					titleText.setEditable(true);
				else {
					titleText.setEditable(false);
					titleText.setText(null);
					copiesNumberText.setEditable(false);
					copiesNumberText.setText(null);
					weightText.setEditable(false);
					weightText.setText(null);
				}
			} catch (NullPointerException e2) {
			}

		});
		titleText.setOnKeyTyped(e -> {
			try {
				if (!titleText.getText().trim().equalsIgnoreCase(""))
					copiesNumberText.setEditable(true);
				else {
					copiesNumberText.setEditable(false);
					copiesNumberText.setText(null);
					weightText.setEditable(false);
					weightText.setText(null);
				}
			} catch (NullPointerException e2) {
			}

		});
		copiesNumberText.setOnKeyTyped(e -> {
			try {
				if (isInteger(copiesNumberText.getText().trim())) {
					weightText.setEditable(true);
					processLabel.setText(null);
				} else {
					weightText.setEditable(false);
					weightText.setText(null);
					copiesNumberText.setText(null);
					processLabel.setText("please give an integer value for copies field !!");

				}
			} catch (NumberFormatException e2) {

			}

		});
		weightText.setOnKeyTyped(e -> {
			try {
				if (!isDouble(weightText.getText().trim())) {

					weightText.setText(null);
					processLabel.setText("please give an double value for copies field !!");
				} else
					processLabel.setText(null);

			} catch (NumberFormatException e2) {
			}
		});

		back.setOnAction(e -> {
			try {
				addMediaCheckerScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		home.setOnAction(e -> {
			try {
				startScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		addGame.setOnAction(e -> {
			try {

				if (!codeText.getText().equals(null) && !codeText.getText().equals(null)
						&& !copiesNumberText.getText().equals(null) && !weightText.getText().equals(null)) {
					if (isInteger(copiesNumberText.getText().trim())) {
						if (isDouble(weightText.getText().trim())) {
							int d = -404; // checker

							for (int i = 0; i < m.media.size(); i++) {
								if (m.media.get(i).getCode().equalsIgnoreCase(codeText.getText().trim()))
									d = i;
							}
							if (d == -404) {
								processLabel.setText("Game Added successfully !");

								try {
									writeText("media.txt",
											"Game ," + titleText.getText().trim() + " , " + copiesNumberText.getText()
													+ "," + codeText.getText() + " , " + weightText.getText(),
											true);
									writeText("mediaLeft.txt",
											"Game ," + titleText.getText().trim() + " , " + copiesNumberText.getText()
													+ "," + codeText.getText() + " , " + weightText.getText(),
											true);
								} catch (IOException e1) {

								}
								m.addGame(titleText.getText(), Integer.parseInt(copiesNumberText.getText()),
										codeText.getText(), Double.parseDouble(weightText.getText()));
							} else

								processLabel.setText("Game Code IS TAKEN!!");

						}
					}
				}
			} catch (NullPointerException e2) {
				processLabel.setText("PLEASE FILL THE FIELDS!!");
			}

		});

		HBox box = new HBox();
		box.setSpacing(100);
		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(addGame, home, back);

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(100)); // to move the nodes out of edge

		pane.setBottom(box);
		GridPane grid = new GridPane();
		grid.setVgap(10);
		grid.setHgap(10);

		grid.add(codeLabel, 0, 0);
		grid.add(codeText, 8, 0);
		grid.add(titleLabel, 0, 2);
		grid.add(titleText, 8, 2);
		grid.add(numberCopiesLabel, 0, 4);
		grid.add(copiesNumberText, 8, 4);
		grid.add(weightLabel, 0, 6);
		grid.add(weightText, 8, 6);
		grid.add(processLabel, 8, 8);
		grid.setAlignment(Pos.CENTER);
		pane.setCenter(grid);

		Scene scene = new Scene(pane, 500, 500);
		mainStage.setTitle("Add Game Page");
		mainStage.setScene(scene);
		mainStage.setMaximized(true);
		mainStage.show();

	}

	private void addAlbumScene(Stage mainStage) throws FileNotFoundException {
		// Declaring Labels & font size & labelWidth
		Label codeLabel = new Label("Album Code : ");
		codeLabel.setFont(new Font("font", 40)); // to make font Bigger
		codeLabel.setMinWidth(300);

		Label titleLabel = new Label("Album Title : ");
		titleLabel.setFont(new Font("font", 40));
		titleLabel.setMinWidth(300);

		Label numberCopiesLabel = new Label("Number Of Copies : ");
		numberCopiesLabel.setFont(new Font("font", 40));
		numberCopiesLabel.setMinWidth(350);

		Label artistLabel = new Label("Album Artist : ");
		artistLabel.setFont(new Font("font", 40));
		artistLabel.setMinWidth(350);

		Label songsLabel = new Label("Album songs : ");
		songsLabel.setFont(new Font("font", 40));
		songsLabel.setMinWidth(350);

		Label processLabel = new Label("");
		processLabel.setFont(new Font(30));
		processLabel.setMinWidth(350);
		processLabel.setTextFill(Color.RED);

		// Declaring TextFields
		TextField codeText = new TextField();
		codeText.setText(null);
		codeText.setPrefSize(300, 25);

		TextField titleText = new TextField();
		titleText.setPrefSize(300, 25);
		titleText.setEditable(false);
		TextField copiesNumberText = new TextField();
		copiesNumberText.setPrefSize(300, 25);
		copiesNumberText.setEditable(false);
		TextField artistText = new TextField();
		artistText.setPrefSize(300, 25);
		artistText.setEditable(false);
		TextField songsText = new TextField();
		songsText.setPrefSize(300, 25);
		songsText.setEditable(false);

		Image backIcon = new Image(new FileInputStream("back.png"));
		Image addIcon = new Image(new FileInputStream("add.png"));
		Image homeIcon = new Image(new FileInputStream("home.png"));

		ImageView homeView = new ImageView(homeIcon);
		// to make the image fits good
		homeView.setFitWidth(100);
		homeView.setFitHeight(100);

		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(100);
		backView.setFitHeight(100);
		ImageView addView = new ImageView(addIcon);
		// to make the image fits good
		addView.setFitWidth(100);
		addView.setFitHeight(100);

		Button back = new Button("", backView);
		Button addAlbum = new Button("", addView);
		Button home = new Button("", homeView);

		back.setOnAction(e -> {
			try {
				addMediaCheckerScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		home.setOnAction(e -> {
			try {
				startScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});

		addAlbum.setOnAction(e -> {

			try {
				if (!codeText.getText().equals(null) && !codeText.getText().equals(null)
						&& !copiesNumberText.getText().equals(null) && !artistText.getText().equals(null)
						&& !songsText.getText().equals(null)) {
					if (isInteger(copiesNumberText.getText().trim())) {
						int d = -404; // checker
						for (int i = 0; i < m.media.size(); i++) {
							if (m.media.get(i).getCode().equalsIgnoreCase(codeText.getText().trim()))
								d = i;
						}
						if (d == -404) {
							processLabel.setText("Album  Added successfully !");

							m.addAlbum(titleText.getText().trim(), Integer.parseInt(copiesNumberText.getText().trim()),
									codeText.getText().trim(), artistText.getText().trim(), songsText.getText().trim());
							try {
								writeText("media.txt",
										"Album ," + titleText.getText() + " , " + copiesNumberText.getText() + ","
												+ codeText.getText() + " , " + artistText.getText() + " , "
												+ songsText.getText(),
										true);
								writeText("mediaLeft.txt",
										"Album ," + titleText.getText() + " , " + copiesNumberText.getText() + ","
												+ codeText.getText() + " , " + artistText.getText() + " , "
												+ songsText.getText(),
										true);
							} catch (IOException e1) {

							}

						} else {
							processLabel.setText("Album Code IS TAKEN!!");

						}

					}
				}

			} catch (NullPointerException e2) {
				processLabel.setText("PLEASE FILL THE FIELDS!!");
			}

		});
		// lines of code to make text field active and inactive depends to before code
		codeText.setOnKeyTyped(e -> {
			try {
				if (!codeText.getText().trim().equalsIgnoreCase(""))
					titleText.setEditable(true);
				else {
					titleText.setEditable(false);
					titleText.setText(null);
					artistText.setText(null);
					songsText.setText(null);
					artistText.setEditable(false);
					copiesNumberText.setText(null);
					songsText.setEditable(false);
					copiesNumberText.setEditable(false);

				}
			} catch (NullPointerException e2) {
			}
		});
		titleText.setOnKeyTyped(e -> {
			try {
				if (!titleText.getText().trim().equalsIgnoreCase(""))
					copiesNumberText.setEditable(true);
				else {
					copiesNumberText.setText(null);
					copiesNumberText.setEditable(false);
					artistText.setText(null);
					songsText.setText(null);
					artistText.setEditable(false);

					songsText.setEditable(false);

				}
			} catch (NullPointerException e2) {

			}
		});
		copiesNumberText.setOnKeyTyped(e -> {
			try {
				if (isInteger(copiesNumberText.getText().trim())) {
					artistText.setEditable(true);
					processLabel.setText(null);
				} else {

					artistText.setText(null);
					songsText.setText(null);
					artistText.setEditable(false);
					songsText.setEditable(false);
					copiesNumberText.setText(null);
					processLabel.setText("please give an integer value for copies field!!");
				}
			} catch (NullPointerException e2) {

			}

		});
		artistText.setOnKeyTyped(e -> {
			try {
				if (!artistText.getText().trim().equalsIgnoreCase(""))
					songsText.setEditable(true);
				else {
					songsText.setEditable(false);
					songsText.setText(null);
				}
			} catch (NullPointerException e2) {

			}

		});

		HBox box = new HBox();
		box.setSpacing(100);
		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(addAlbum, home, back);

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(100)); // to move the nodes out of edge

		pane.setBottom(box);
		GridPane grid = new GridPane();
		grid.setVgap(10);
		grid.setHgap(10);

		grid.add(codeLabel, 0, 0);
		grid.add(codeText, 8, 0);
		grid.add(titleLabel, 0, 2);
		grid.add(titleText, 8, 2);
		grid.add(numberCopiesLabel, 0, 4);
		grid.add(copiesNumberText, 8, 4);
		grid.add(artistLabel, 0, 6);
		grid.add(artistText, 8, 6);
		grid.add(songsLabel, 0, 8);
		grid.add(songsText, 8, 8);
		grid.add(processLabel, 8, 10);
		grid.setAlignment(Pos.CENTER);
		pane.setCenter(grid);

		Scene scene = new Scene(pane, 500, 500);
		mainStage.setTitle("Add Album Page");
		mainStage.setScene(scene);
		mainStage.setMaximized(true);
		mainStage.show();

	}

	private void addMovieScene(Stage mainStage) throws FileNotFoundException {
		// Declaring Labels & font size & labelWidth
		Label codeLabel = new Label("Media Code : ");
		codeLabel.setFont(new Font("font", 40)); // to make font Bigger
		codeLabel.setMinWidth(300);

		Label titleLabel = new Label("Movie Title : ");
		titleLabel.setFont(new Font("font", 40));
		titleLabel.setMinWidth(300);

		Label numberCopiesLabel = new Label("Number Of Copies : ");
		numberCopiesLabel.setFont(new Font("font", 40));
		numberCopiesLabel.setMinWidth(350);

		Label ratingLabel = new Label("Movie Rating : ");
		ratingLabel.setFont(new Font("font", 40));
		ratingLabel.setMinWidth(350);

		Label processLabel = new Label("");
		processLabel.setFont(new Font(30));
		processLabel.setMinWidth(350);
		processLabel.setTextFill(Color.RED);

		// Declaring TextFields
		TextField codeText = new TextField();
		codeText.setPrefSize(300, 25);
		codeText.setText(null);

		TextField titleText = new TextField();
		titleText.setPrefSize(300, 25);
		titleText.setEditable(false);
		TextField copiesNumberText = new TextField();
		copiesNumberText.setPrefSize(300, 25);
		copiesNumberText.setEditable(false);
		TextField ratingText = new TextField();
		ratingText.setPrefSize(300, 25);
		ratingText.setEditable(false);

		Image backIcon = new Image(new FileInputStream("back.png"));
		Image addIcon = new Image(new FileInputStream("add.png"));
		Image homeIcon = new Image(new FileInputStream("home.png"));

		ImageView homeView = new ImageView(homeIcon);
		// to make the image fits good
		homeView.setFitWidth(100);
		homeView.setFitHeight(100);

		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(100);
		backView.setFitHeight(100);
		ImageView addView = new ImageView(addIcon);
		// to make the image fits good
		addView.setFitWidth(100);
		addView.setFitHeight(100);

		Button back = new Button("", backView);
		Button home = new Button("", homeView);
		Button addMovie = new Button("", addView);

		back.setOnAction(e -> {
			try {
				addMediaCheckerScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		home.setOnAction(e -> {
			try {
				startScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});

		addMovie.setOnAction(e -> {

			try {

				if (!codeText.getText().equals(null) && !codeText.getText().equals(null)
						&& !copiesNumberText.getText().equals(null) && !ratingText.getText().equals(null)) {
					if (isInteger(copiesNumberText.getText().trim())) {
						int d = -404; // checker
						for (int i = 0; i < m.media.size(); i++) {
							if (m.media.get(i).getCode().equalsIgnoreCase(codeText.getText().trim()))
								d = i;
						}
						if (d == -404) {
							processLabel.setText("Movie Added successfully !");

							try {
								writeText("media.txt",
										"Movie ," + titleText.getText().trim() + " , " + copiesNumberText.getText()
												+ "," + codeText.getText() + " , " + ratingText.getText(),
										true);
								writeText("mediaLeft.txt",
										"Movie ," + titleText.getText().trim() + " , " + copiesNumberText.getText()
												+ "," + codeText.getText() + " , " + ratingText.getText(),
										true);
							} catch (IOException e1) {

							}
							m.addMovie(titleText.getText(), Integer.parseInt(copiesNumberText.getText()),
									codeText.getText(), ratingText.getText().trim());
						} else
							processLabel.setText("Movie Code ID IS TAKEN!!");

					}
				}

			} catch (NullPointerException e2) {
				processLabel.setText("PLEASE FILL THE FIELDS!!");

			}

		});

		// lines of code to make text field active and inactive depends to before code
		codeText.setOnKeyTyped(e -> {
			if (!codeText.getText().trim().equalsIgnoreCase(""))
				titleText.setEditable(true);
			else {
				titleText.setEditable(false);
				titleText.setText(null);
				copiesNumberText.setEditable(false);
				copiesNumberText.setText(null);
				ratingText.setEditable(false);
				ratingText.setText(null);

			}
		});
		titleText.setOnKeyTyped(e -> {

			try {
				if (!titleText.getText().trim().equalsIgnoreCase(""))
					copiesNumberText.setEditable(true);
				else {
					copiesNumberText.setEditable(false);
					copiesNumberText.setText(null);
					ratingText.setEditable(false);
					ratingText.setText(null);

				}
			} catch (Exception e2) {

			}
		});
		copiesNumberText.setOnKeyTyped(e -> {
			try {
				if (isInteger(copiesNumberText.getText().trim())) {
					ratingText.setEditable(true);
					processLabel.setText(null);
				} else {
					ratingText.setEditable(false);
					ratingText.setText(null);
					copiesNumberText.setText(null);
					processLabel.setText("please give an integer value in copies field!!");
				}
			} catch (NullPointerException e2) {

			}

		});

		HBox box = new HBox();
		box.setSpacing(100);
		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(addMovie, home, back);

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(100)); // to move the nodes out of edge

		pane.setBottom(box);
		GridPane grid = new GridPane();
		grid.setVgap(10);
		grid.setHgap(10);

		grid.add(codeLabel, 0, 0);
		grid.add(codeText, 8, 0);
		grid.add(titleLabel, 0, 2);
		grid.add(titleText, 8, 2);
		grid.add(numberCopiesLabel, 0, 4);
		grid.add(copiesNumberText, 8, 4);
		grid.add(ratingLabel, 0, 6);
		grid.add(ratingText, 8, 6);
		grid.add(processLabel, 8, 8);
		grid.setAlignment(Pos.CENTER);
		pane.setCenter(grid);

		Scene scene = new Scene(pane, 500, 500);
		mainStage.setTitle("Add Movie Page");
		mainStage.setScene(scene);
		mainStage.setMaximized(true);
		mainStage.show();

	}

	private void deleteMediaChecker(Stage mainStage) throws FileNotFoundException {
		ComboBox<String> comboBox = new ComboBox<>();
		comboBox.setPromptText("--Please select Media --");

		for (int i = 0; i < m.media.size(); i++) {
			Media media = m.media.get(i);

			if (media instanceof Game) {
				comboBox.getItems().add("Game : " + m.media.get(i).getCode() + "  ,  " + m.media.get(i).getTitle());

			} else if (media instanceof Album) {
				comboBox.getItems().add("Album : " + m.media.get(i).getCode() + "  ,  " + m.media.get(i).getTitle());

			} else if (media instanceof Movie) {
				comboBox.getItems().add("Movie : " + m.media.get(i).getCode() + "  ,  " + m.media.get(i).getTitle());

			}

		}
		comboBox.setPrefSize(200, 50);

		Image backIcon = new Image(new FileInputStream("back.png"));
		Image homeIcon = new Image(new FileInputStream("home.png"));

		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(100);
		backView.setFitHeight(100);

		ImageView homeView = new ImageView(homeIcon);
		// to make the image fits good
		homeView.setFitWidth(100);
		homeView.setFitHeight(100);

		Button back = new Button("", backView);
		Button home = new Button("", homeView);
		// BUTTON SIZE CHANGING

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(100)); // to move the nodes out of edge

		GridPane grid = new GridPane();
		grid.setVgap(10);
		grid.setHgap(10);
		grid.add(comboBox, 0, 0);
		grid.setAlignment(Pos.CENTER);

		pane.setCenter(grid);

		HBox box = new HBox();
		box.setSpacing(40);
		box.getChildren().addAll(home, back);

		box.setAlignment(Pos.BOTTOM_CENTER);

		pane.setBottom(box);

		// Action Buttons
		back.setOnAction(e -> {
			try {
				mediaScene(mainStage);
				mainStage.setMaximized(true);
			} catch (FileNotFoundException e1) {

			}

		});
		home.setOnAction(e -> {
			try {
				startScene(mainStage);
				mainStage.setMaximized(true);
			} catch (FileNotFoundException e1) {

			}

		});
		comboBox.setOnAction(e -> {
			String string = comboBox.getValue();
			String[] array = string.split(",");

			if (array.length == 2) {
				String[] secArr = array[0].split(":");
				String code = secArr[1].trim();

				int d = -404; // checker
				for (int i = 0; i < m.media.size(); i++) {
					if (m.media.get(i).getCode().equalsIgnoreCase(secArr[1].trim()))
						d = i;

				}

				if (d != -404) {
					Media media = m.media.get(d);
					String title = media.getTitle().trim();
					String copies = Integer.toString(media.getNumberOfCopies());

					if (media instanceof Game) {
						try {
							Game game = (Game) media;
							deleteGameScene(mainStage, code, title, copies, Double.toString(game.getWeight()));
							mainStage.setMaximized(true);
						} catch (FileNotFoundException e1) {

						}

					} else if (media instanceof Album) {
						try {
							Album album = (Album) media;
							deleteAlbumScene(mainStage, code, title, copies, album.getArtist(), album.getSongs());
							mainStage.setMaximized(true);
						} catch (FileNotFoundException e1) {

						}

					} else if (media instanceof Movie) {
						try {
							Movie movie = (Movie) media;
							deleteMovieScene(mainStage, code, title, copies, movie.getRating());
							mainStage.setMaximized(true);
						} catch (FileNotFoundException e1) {

						}

					}

				}
			}

		});

		Scene scene = new Scene(pane, 300, 500);
		mainStage.setMaximized(true);
		mainStage.setTitle("Media Checker ");
		mainStage.setScene(scene);
		mainStage.show();

	}

	private void deleteGameScene(Stage mainStage, String code, String title, String copies, String weight)
			throws FileNotFoundException {
		// Declaring Labels & font size & labelWidth
		Label codeLabel = new Label("Media Code : ");
		codeLabel.setFont(new Font("font", 40)); // to make font Bigger
		codeLabel.setMinWidth(300);

		Label titleLabel = new Label("Game Title : ");
		titleLabel.setFont(new Font("font", 40));
		titleLabel.setMinWidth(300);

		Label numberCopiesLabel = new Label("Number Of Copies : ");
		numberCopiesLabel.setFont(new Font("font", 40));
		numberCopiesLabel.setMinWidth(350);

		Label weightLabel = new Label("Game Weight : ");
		weightLabel.setFont(new Font("font", 40));
		weightLabel.setMinWidth(350);

		Label processLabel = new Label("");
		processLabel.setFont(new Font(30));
		processLabel.setMinWidth(350);
		processLabel.setTextFill(Color.RED);

		// Declaring TextFields
		TextField codeText = new TextField();
		codeText.setPrefSize(300, 25);
		codeText.setText(code);
		codeText.setEditable(false);
		TextField titleText = new TextField();
		titleText.setPrefSize(300, 25);
		titleText.setText(title);
		titleText.setEditable(false);

		TextField copiesNumberText = new TextField();
		copiesNumberText.setPrefSize(300, 25);
		copiesNumberText.setText(copies);
		copiesNumberText.setEditable(false);

		TextField weightText = new TextField();
		weightText.setPrefSize(300, 25);
		weightText.setText(weight);
		weightText.setEditable(false);

		Image backIcon = new Image(new FileInputStream("back.png"));
		Image deleteIcon = new Image(new FileInputStream("delete.png"));
		Image homeIcon = new Image(new FileInputStream("home.png"));

		ImageView homeView = new ImageView(homeIcon);
		// to make the image fits good
		homeView.setFitWidth(100);
		homeView.setFitHeight(100);

		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(100);
		backView.setFitHeight(100);

		ImageView deleteView = new ImageView(deleteIcon);
		// to make the image fits good
		deleteView.setFitWidth(100);
		deleteView.setFitHeight(100);

		Button delete = new Button("", deleteView);
		Button back = new Button("", backView);
		Button home = new Button("", homeView);

		back.setOnAction(e -> {
			try {
				deleteMediaChecker(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		home.setOnAction(e -> {
			try {
				startScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		delete.setOnAction(e -> {
			deleteMediaButton(code);
			processLabel.setText("Game Deleted successfully!!");

			codeText.setText(null);

			titleText.setText(null);

			copiesNumberText.setText(null);

			weightText.setText(null);

		});

		HBox box = new HBox();
		box.setSpacing(100);
		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(delete, home, back);

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(100)); // to move the nodes out of edge

		pane.setBottom(box);
		GridPane grid = new GridPane();
		grid.setVgap(10);
		grid.setHgap(10);

		grid.add(codeLabel, 0, 0);
		grid.add(codeText, 8, 0);
		grid.add(titleLabel, 0, 2);
		grid.add(titleText, 8, 2);
		grid.add(numberCopiesLabel, 0, 4);
		grid.add(copiesNumberText, 8, 4);
		grid.add(weightLabel, 0, 6);
		grid.add(weightText, 8, 6);
		grid.add(processLabel, 8, 8);
		grid.setAlignment(Pos.CENTER);
		pane.setCenter(grid);

		Scene scene = new Scene(pane, 500, 500);
		mainStage.setTitle("Delete Game Page");
		mainStage.setScene(scene);
		mainStage.setMaximized(true);
		mainStage.show();

	}

	private void deleteMediaButton(String code) {
		int d = -404; // checker
		for (int i = 0; i < m.media.size(); i++) {
			if (m.media.get(i).getCode().equalsIgnoreCase(code)) {
				d = i;

			}

		}
		if (d != -404) {
			for (int i = 0; i < m.customers.size(); i++) {
				m.removeFromCart(m.customers.get(i).getID(), code);
				m.returnMedia(m.customers.get(i).getID(), code);

			}
			m.media.remove(d);
			try {
				rentedFile();
				intrestedFile();
				mediaRefresh();
				mediaLeftRefresh();
				customerLeftRefresh();
			} catch (IOException e1) {

			}

		}

	}

	private void deleteAlbumScene(Stage mainStage, String code, String title, String copies, String artist,
			String songs) throws FileNotFoundException {
		// Declaring Labels & font size & labelWidth
		Label codeLabel = new Label("Album Code : ");
		codeLabel.setFont(new Font("font", 40)); // to make font Bigger
		codeLabel.setMinWidth(300);

		Label titleLabel = new Label("Album Title : ");
		titleLabel.setFont(new Font("font", 40));
		titleLabel.setMinWidth(300);

		Label numberCopiesLabel = new Label("Number Of Copies : ");
		numberCopiesLabel.setFont(new Font("font", 40));
		numberCopiesLabel.setMinWidth(350);

		Label artistLabel = new Label("Album Artist : ");
		artistLabel.setFont(new Font("font", 40));
		artistLabel.setMinWidth(350);

		Label songsLabel = new Label("Album songs : ");
		songsLabel.setFont(new Font("font", 40));
		songsLabel.setMinWidth(350);

		Label processLabel = new Label("");
		processLabel.setFont(new Font(30));
		processLabel.setMinWidth(350);
		processLabel.setTextFill(Color.RED);

		// Declaring TextFields
		TextField codeText = new TextField();
		codeText.setPrefSize(300, 25);
		codeText.setText(code);
		codeText.setEditable(false);
		TextField titleText = new TextField();
		titleText.setPrefSize(300, 25);
		titleText.setText(title);
		titleText.setEditable(false);
		TextField copiesNumberText = new TextField();
		copiesNumberText.setPrefSize(300, 25);
		copiesNumberText.setText(copies);
		copiesNumberText.setEditable(false);
		TextField artistText = new TextField();
		artistText.setPrefSize(300, 25);
		artistText.setText(artist);
		artistText.setEditable(false);
		TextField songsText = new TextField();
		songsText.setPrefSize(300, 25);
		songsText.setText(songs);
		songsText.setEditable(false);

		Image backIcon = new Image(new FileInputStream("back.png"));
		Image deleteIcon = new Image(new FileInputStream("delete.png"));
		Image homeIcon = new Image(new FileInputStream("home.png"));

		ImageView homeView = new ImageView(homeIcon);
		// to make the image fits good
		homeView.setFitWidth(100);
		homeView.setFitHeight(100);

		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(100);
		backView.setFitHeight(100);
		ImageView deleteView = new ImageView(deleteIcon);

		// to make the image fits good
		deleteView.setFitWidth(100);
		deleteView.setFitHeight(100);

		Button back = new Button("", backView);
		Button home = new Button("", homeView);
		Button delete = new Button("", deleteView);

		back.setOnAction(e -> {
			try {
				deleteMediaChecker(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		home.setOnAction(e -> {
			try {
				startScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		delete.setOnAction(e -> {

			deleteMediaButton(code);
			processLabel.setText("Album Deleted successfully!!");

			codeText.setText(null);

			titleText.setText(null);

			copiesNumberText.setText(null);
			artistText.setText(null);
			songsText.setText(null);

		});
		// lines of code to make text field active and inactive depends to before code

		HBox box = new HBox();
		box.setSpacing(100);
		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(delete, home, back);

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(100)); // to move the nodes out of edge

		pane.setBottom(box);
		GridPane grid = new GridPane();
		grid.setVgap(10);
		grid.setHgap(10);

		grid.add(codeLabel, 0, 0);
		grid.add(codeText, 8, 0);
		grid.add(titleLabel, 0, 2);
		grid.add(titleText, 8, 2);
		grid.add(numberCopiesLabel, 0, 4);
		grid.add(copiesNumberText, 8, 4);
		grid.add(artistLabel, 0, 6);
		grid.add(artistText, 8, 6);
		grid.add(songsLabel, 0, 8);
		grid.add(songsText, 8, 8);
		grid.add(processLabel, 8, 10);
		grid.setAlignment(Pos.CENTER);
		pane.setCenter(grid);

		Scene scene = new Scene(pane, 500, 500);
		mainStage.setTitle("delete Album Page");
		mainStage.setScene(scene);
		mainStage.setMaximized(true);
		mainStage.show();

	}

	private void deleteMovieScene(Stage mainStage, String code, String title, String copies, String rating)
			throws FileNotFoundException {
		// Declaring Labels & font size & labelWidth
		Label codeLabel = new Label("Media Code : ");
		codeLabel.setFont(new Font("font", 40)); // to make font Bigger
		codeLabel.setMinWidth(300);

		Label titleLabel = new Label("Movie Title : ");
		titleLabel.setFont(new Font("font", 40));
		titleLabel.setMinWidth(300);

		Label numberCopiesLabel = new Label("Number Of Copies : ");
		numberCopiesLabel.setFont(new Font("font", 40));
		numberCopiesLabel.setMinWidth(350);

		Label ratingLabel = new Label("Movie Rating : ");
		ratingLabel.setFont(new Font("font", 40));
		ratingLabel.setMinWidth(350);

		Label processLabel = new Label("");
		processLabel.setFont(new Font(30));
		processLabel.setMinWidth(350);
		processLabel.setTextFill(Color.RED);

		// Declaring TextFields
		TextField codeText = new TextField();
		codeText.setPrefSize(300, 25);
		codeText.setText(code);
		codeText.setEditable(false);
		TextField titleText = new TextField();
		titleText.setPrefSize(300, 25);
		titleText.setText(title);
		titleText.setEditable(false);

		TextField copiesNumberText = new TextField();
		copiesNumberText.setPrefSize(300, 25);
		copiesNumberText.setText(copies);
		copiesNumberText.setEditable(false);

		TextField ratingText = new TextField();
		ratingText.setPrefSize(300, 25);
		ratingText.setText(rating);
		ratingText.setEditable(false);

		Image backIcon = new Image(new FileInputStream("back.png"));
		Image deleteIcon = new Image(new FileInputStream("delete.png"));
		Image homeIcon = new Image(new FileInputStream("home.png"));

		ImageView homeView = new ImageView(homeIcon);
		// to make the image fits good
		homeView.setFitWidth(100);
		homeView.setFitHeight(100);

		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(100);
		backView.setFitHeight(100);
		ImageView deleteView = new ImageView(deleteIcon);
		// to make the image fits good
		deleteView.setFitWidth(100);
		deleteView.setFitHeight(100);

		Button back = new Button("", backView);
		Button home = new Button("", homeView);
		Button delete = new Button("", deleteView);

		back.setOnAction(e -> {
			try {
				deleteMediaChecker(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		home.setOnAction(e -> {
			try {
				startScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		delete.setOnAction(e -> {
			deleteMediaButton(code);
			processLabel.setText("Game Deleted successfully!!");

			codeText.setText(null);

			titleText.setText(null);

			copiesNumberText.setText(null);

			ratingText.setText(null);

		});

		HBox box = new HBox();
		box.setSpacing(100);
		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(delete, home, back);

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(100)); // to move the nodes out of edge

		pane.setBottom(box);
		GridPane grid = new GridPane();
		grid.setVgap(10);
		grid.setHgap(10);

		grid.add(codeLabel, 0, 0);
		grid.add(codeText, 8, 0);
		grid.add(titleLabel, 0, 2);
		grid.add(titleText, 8, 2);
		grid.add(numberCopiesLabel, 0, 4);
		grid.add(copiesNumberText, 8, 4);
		grid.add(ratingLabel, 0, 6);
		grid.add(ratingText, 8, 6);
		grid.add(processLabel, 8, 8);
		grid.setAlignment(Pos.CENTER);
		pane.setCenter(grid);

		Scene scene = new Scene(pane, 500, 500);
		mainStage.setTitle("Delete Movie Page");
		mainStage.setScene(scene);
		mainStage.setMaximized(true);
		mainStage.show();

	}

	private void gameInfoScene(Stage mainStage, String code, String title, String copies, String weight)
			throws FileNotFoundException {

		// Declaring Labels & font size & labelWidth
		Label codeLabel = new Label("Media Code : ");
		codeLabel.setFont(new Font("font", 40)); // to make font Bigger
		codeLabel.setMinWidth(300);

		Label titleLabel = new Label("Game Title : ");
		titleLabel.setFont(new Font("font", 40));
		titleLabel.setMinWidth(300);

		Label numberCopiesLabel = new Label("Number Of Copies : ");
		numberCopiesLabel.setFont(new Font("font", 40));
		numberCopiesLabel.setMinWidth(350);

		Label weightLabel = new Label("Game Weight : ");
		weightLabel.setFont(new Font("font", 40));
		weightLabel.setMinWidth(350);

		// Declaring TextFields
		TextField codeText = new TextField();
		codeText.setPrefSize(300, 25);
		codeText.setText(code);
		codeText.setEditable(false);
		TextField titleText = new TextField();
		titleText.setEditable(false);
		titleText.setText(title);
		titleText.setPrefSize(300, 25);
		TextField copiesNumberText = new TextField();
		copiesNumberText.setPrefSize(300, 25);
		copiesNumberText.setText(copies);
		copiesNumberText.setEditable(false);
		TextField weightText = new TextField();
		weightText.setPrefSize(300, 25);
		weightText.setText(weight);
		weightText.setEditable(false);

		Image backIcon = new Image(new FileInputStream("back.png"));

		Image homeIcon = new Image(new FileInputStream("home.png"));
		Image deleteIcon = new Image(new FileInputStream("delete.png"));

		Image updateIcon = new Image(new FileInputStream("update.png"));

		ImageView updateView = new ImageView(updateIcon);
		// to make the image fits good
		updateView.setFitWidth(100);
		updateView.setFitHeight(100);

		ImageView deleteView = new ImageView(deleteIcon);
		// to make the image fits good
		deleteView.setFitWidth(100);
		deleteView.setFitHeight(100);

		ImageView homeView = new ImageView(homeIcon);
		// to make the image fits good
		homeView.setFitWidth(100);
		homeView.setFitHeight(100);

		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(100);
		backView.setFitHeight(100);

		Button back = new Button("", backView);
		Button home = new Button("", homeView);
		Button delete = new Button("", deleteView);
		Button update = new Button("", updateView);

		back.setOnAction(e -> {
			try {
				searchMediaScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		home.setOnAction(e -> {
			try {
				startScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		update.setOnAction(e -> {
			try {
				updateGameScene(mainStage, code, title, copies, weight);
			} catch (FileNotFoundException e1) {

			}

		});
		delete.setOnAction(e -> {
			try {
				deleteGameScene(mainStage, code, title, copies, weight);
			} catch (FileNotFoundException e1) {

			}

		});

		HBox box = new HBox();
		box.setSpacing(100);
		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(update, delete, home, back);

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(100)); // to move the nodes out of edge

		pane.setBottom(box);
		GridPane grid = new GridPane();
		grid.setVgap(10);
		grid.setHgap(10);

		grid.add(codeLabel, 0, 0);
		grid.add(codeText, 8, 0);
		grid.add(titleLabel, 0, 2);
		grid.add(titleText, 8, 2);
		grid.add(numberCopiesLabel, 0, 4);
		grid.add(copiesNumberText, 8, 4);
		grid.add(weightLabel, 0, 6);
		grid.add(weightText, 8, 6);
		grid.setAlignment(Pos.CENTER);
		pane.setCenter(grid);

		Scene scene = new Scene(pane, 500, 500);
		mainStage.setTitle("Game Information Page");
		mainStage.setScene(scene);
		mainStage.setMaximized(true);
		mainStage.show();

	}

	private void movieInfoScene(Stage mainStage, String code, String title, String copies, String rating)
			throws FileNotFoundException {
		// Declaring Labels & font size & labelWidth
		Label codeLabel = new Label("Media Code : ");
		codeLabel.setFont(new Font("font", 40)); // to make font Bigger
		codeLabel.setMinWidth(300);

		Label titleLabel = new Label("Movie Title : ");
		titleLabel.setFont(new Font("font", 40));
		titleLabel.setMinWidth(300);

		Label numberCopiesLabel = new Label("Number Of Copies : ");
		numberCopiesLabel.setFont(new Font("font", 40));
		numberCopiesLabel.setMinWidth(350);

		Label ratingLabel = new Label("Movie Rating : ");
		ratingLabel.setFont(new Font("font", 40));
		ratingLabel.setMinWidth(350);

		// Declaring TextFields
		TextField codeText = new TextField();
		codeText.setPrefSize(300, 25);
		codeText.setText(code);
		codeText.setEditable(false);
		TextField titleText = new TextField();
		titleText.setPrefSize(300, 25);
		titleText.setText(title);
		titleText.setEditable(false);
		TextField copiesNumberText = new TextField();
		copiesNumberText.setPrefSize(300, 25);
		copiesNumberText.setText(copies);
		copiesNumberText.setEditable(false);
		TextField ratingText = new TextField();
		ratingText.setPrefSize(300, 25);
		ratingText.setText(rating);
		ratingText.setEditable(false);

		Image backIcon = new Image(new FileInputStream("back.png"));

		Image homeIcon = new Image(new FileInputStream("home.png"));

		Image deleteIcon = new Image(new FileInputStream("delete.png"));

		Image updateIcon = new Image(new FileInputStream("update.png"));

		ImageView updateView = new ImageView(updateIcon);
		// to make the image fits good
		updateView.setFitWidth(100);
		updateView.setFitHeight(100);

		ImageView deleteView = new ImageView(deleteIcon);
		// to make the image fits good
		deleteView.setFitWidth(100);
		deleteView.setFitHeight(100);

		ImageView homeView = new ImageView(homeIcon);
		// to make the image fits good
		homeView.setFitWidth(100);
		homeView.setFitHeight(100);

		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(100);
		backView.setFitHeight(100);

		Button back = new Button("", backView);
		Button home = new Button("", homeView);
		Button delete = new Button("", deleteView);
		Button update = new Button("", updateView);

		back.setOnAction(e -> {
			try {
				searchMediaScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});

		home.setOnAction(e -> {
			try {
				startScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		update.setOnAction(e -> {
			try {
				updateMovieScene(mainStage, code, title, copies, rating);
			} catch (FileNotFoundException e1) {

			}
		});
		delete.setOnAction(e -> {
			try {
				deleteMovieScene(mainStage, code, title, copies, rating);
			} catch (FileNotFoundException e1) {

			}
		});

		HBox box = new HBox();
		box.setSpacing(100);
		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(update, delete, home, back);

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(100)); // to move the nodes out of edge

		pane.setBottom(box);
		GridPane grid = new GridPane();
		grid.setVgap(10);
		grid.setHgap(10);

		grid.add(codeLabel, 0, 0);
		grid.add(codeText, 8, 0);
		grid.add(titleLabel, 0, 2);
		grid.add(titleText, 8, 2);
		grid.add(numberCopiesLabel, 0, 4);
		grid.add(copiesNumberText, 8, 4);
		grid.add(ratingLabel, 0, 6);
		grid.add(ratingText, 8, 6);
		grid.setAlignment(Pos.CENTER);
		pane.setCenter(grid);

		Scene scene = new Scene(pane, 500, 500);
		mainStage.setTitle("Movie Information Page");
		mainStage.setScene(scene);
		mainStage.setMaximized(true);
		mainStage.show();

	}

	private void albumInfoScene(Stage mainStage, String code, String title, String copies, String artist, String songs)
			throws FileNotFoundException {
		// Declaring Labels & font size & labelWidth
		Label codeLabel = new Label("Album Code : ");
		codeLabel.setFont(new Font("font", 40)); // to make font Bigger
		codeLabel.setMinWidth(300);

		Label titleLabel = new Label("Album Title : ");
		titleLabel.setFont(new Font("font", 40));
		titleLabel.setMinWidth(300);

		Label numberCopiesLabel = new Label("Number Of Copies : ");
		numberCopiesLabel.setFont(new Font("font", 40));
		numberCopiesLabel.setMinWidth(350);

		Label artistLabel = new Label("Album Artist : ");
		artistLabel.setFont(new Font("font", 40));
		artistLabel.setMinWidth(350);

		Label songsLabel = new Label("Album songs : ");
		songsLabel.setFont(new Font("font", 40));
		songsLabel.setMinWidth(350);

		// Declaring TextFields
		TextField codeText = new TextField();
		codeText.setPrefSize(300, 25);
		codeText.setText(code);
		codeText.setEditable(false);

		TextField titleText = new TextField();
		titleText.setPrefSize(300, 25);
		titleText.setText(title);
		titleText.setEditable(false);
		TextField copiesNumberText = new TextField();
		copiesNumberText.setPrefSize(300, 25);
		copiesNumberText.setText(copies);
		copiesNumberText.setEditable(false);
		TextField artistText = new TextField();
		artistText.setPrefSize(300, 25);
		artistText.setText(artist);
		artistText.setEditable(false);
		TextField songsText = new TextField();
		songsText.setPrefSize(300, 25);
		songsText.setText(songs);
		songsText.setEditable(false);

		Image backIcon = new Image(new FileInputStream("back.png"));

		Image homeIcon = new Image(new FileInputStream("home.png"));

		Image deleteIcon = new Image(new FileInputStream("delete.png"));

		Image updateIcon = new Image(new FileInputStream("update.png"));

		ImageView updateView = new ImageView(updateIcon);
		// to make the image fits good
		updateView.setFitWidth(100);
		updateView.setFitHeight(100);

		ImageView deleteView = new ImageView(deleteIcon);
		// to make the image fits good
		deleteView.setFitWidth(100);
		deleteView.setFitHeight(100);

		ImageView homeView = new ImageView(homeIcon);
		// to make the image fits good
		homeView.setFitWidth(100);
		homeView.setFitHeight(100);

		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(100);
		backView.setFitHeight(100);

		Button back = new Button("", backView);

		Button home = new Button("", homeView);

		Button delete = new Button("", deleteView);
		Button update = new Button("", updateView);

		back.setOnAction(e -> {
			try {
				updateMediaChecker(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		home.setOnAction(e -> {
			try {
				startScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		update.setOnAction(e -> {
			try {
				updateAlbumScene(mainStage, code, title, copies, artist, songs);

			} catch (FileNotFoundException e1) {

			}
		});

		delete.setOnAction(e -> {
			try {
				deleteAlbumScene(mainStage, code, title, copies, artist, songs);

			} catch (FileNotFoundException e1) {

			}
		});

		HBox box = new HBox();
		box.setSpacing(100);
		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(update, delete, home, back);

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(100)); // to move the nodes out of edge

		pane.setBottom(box);
		GridPane grid = new GridPane();
		grid.setVgap(10);
		grid.setHgap(10);

		grid.add(codeLabel, 0, 0);
		grid.add(codeText, 8, 0);
		grid.add(titleLabel, 0, 2);
		grid.add(titleText, 8, 2);
		grid.add(numberCopiesLabel, 0, 4);
		grid.add(copiesNumberText, 8, 4);
		grid.add(artistLabel, 0, 6);
		grid.add(artistText, 8, 6);
		grid.add(songsLabel, 0, 8);
		grid.add(songsText, 8, 8);
		grid.setAlignment(Pos.CENTER);
		pane.setCenter(grid);

		Scene scene = new Scene(pane, 500, 500);
		mainStage.setTitle("Album Information Page");
		mainStage.setScene(scene);
		mainStage.setMaximized(true);
		mainStage.show();

	}

	private void updateMediaChecker(Stage mainStage) throws FileNotFoundException {
		ComboBox<String> comboBox = new ComboBox<>();
		comboBox.setPromptText("--Please select Media --");

		for (int i = 0; i < m.media.size(); i++) {
			Media media = m.media.get(i);

			if (media instanceof Game) {
				comboBox.getItems().add("Game : " + m.media.get(i).getCode() + "  ,  " + m.media.get(i).getTitle());

			} else if (media instanceof Album) {
				comboBox.getItems().add("Album : " + m.media.get(i).getCode() + "  ,  " + m.media.get(i).getTitle());

			} else if (media instanceof Movie) {
				comboBox.getItems().add("Movie : " + m.media.get(i).getCode() + "  ,  " + m.media.get(i).getTitle());

			}

		}
		comboBox.setPrefSize(200, 50);

		Image backIcon = new Image(new FileInputStream("back.png"));
		Image homeIcon = new Image(new FileInputStream("home.png"));

		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(100);
		backView.setFitHeight(100);

		ImageView homeView = new ImageView(homeIcon);
		// to make the image fits good
		homeView.setFitWidth(100);
		homeView.setFitHeight(100);

		Button back = new Button("", backView);
		Button home = new Button("", homeView);
		// BUTTON SIZE CHANGING

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(100)); // to move the nodes out of edge

		GridPane grid = new GridPane();
		grid.setVgap(10);
		grid.setHgap(10);
		grid.add(comboBox, 0, 0);
		grid.setAlignment(Pos.CENTER);

		pane.setCenter(grid);

		HBox box = new HBox();
		box.setSpacing(40);
		box.getChildren().addAll(home, back);

		box.setAlignment(Pos.BOTTOM_CENTER);

		pane.setBottom(box);

		// Action Buttons
		back.setOnAction(e -> {
			try {
				mediaScene(mainStage);
				mainStage.setMaximized(true);
			} catch (FileNotFoundException e1) {

			}

		});
		home.setOnAction(e -> {
			try {
				startScene(mainStage);
				mainStage.setMaximized(true);
			} catch (FileNotFoundException e1) {

			}

		});
		comboBox.setOnAction(e -> {
			String string = comboBox.getValue();
			String[] array = string.split(",");

			if (array.length == 2) {
				String[] secArr = array[0].split(":");
				String code = secArr[1].trim();

				int d = -404; // checker
				for (int i = 0; i < m.media.size(); i++) {
					if (m.media.get(i).getCode().equalsIgnoreCase(secArr[1].trim()))
						d = i;

				}

				if (d != -404) {
					Media media = m.media.get(d);
					String title = media.getTitle().trim();
					String copies = Integer.toString(media.getNumberOfCopies());

					if (media instanceof Game) {
						try {
							Game game = (Game) media;
							updateGameScene(mainStage, code, title, copies, Double.toString(game.getWeight()));
							mainStage.setMaximized(true);
						} catch (FileNotFoundException e1) {

						}

					} else if (media instanceof Album) {
						try {
							Album album = (Album) media;
							updateAlbumScene(mainStage, code, title, copies, album.getArtist(), album.getSongs());
							mainStage.setMaximized(true);
						} catch (FileNotFoundException e1) {

						}

					} else if (media instanceof Movie) {
						try {
							Movie movie = (Movie) media;
							updateMovieScene(mainStage, code, title, copies, movie.getRating());
							mainStage.setMaximized(true);
						} catch (FileNotFoundException e1) {

						}

					}

				}
			}

		});

		Scene scene = new Scene(pane, 300, 500);
		mainStage.setMaximized(true);
		mainStage.setTitle("Media Checker ");
		mainStage.setScene(scene);
		mainStage.show();

	}

	private void updateGameScene(Stage mainStage, String code, String title, String copies, String weight)
			throws FileNotFoundException {
		// Declaring Labels & font size & labelWidth
		Label codeLabel = new Label("Media Code : ");
		codeLabel.setFont(new Font("font", 40)); // to make font Bigger
		codeLabel.setMinWidth(300);

		Label titleLabel = new Label("Game Title : ");
		titleLabel.setFont(new Font("font", 40));
		titleLabel.setMinWidth(300);

		Label numberCopiesLabel = new Label("Number Of Copies : ");
		numberCopiesLabel.setFont(new Font("font", 40));
		numberCopiesLabel.setMinWidth(350);

		Label weightLabel = new Label("Game Weight : ");
		weightLabel.setFont(new Font("font", 40));
		weightLabel.setMinWidth(350);

		Label processLabel = new Label("");
		processLabel.setFont(new Font(30));
		processLabel.setMinWidth(350);
		processLabel.setTextFill(Color.RED);

		// Declaring TextFields
		TextField codeText = new TextField();
		codeText.setPrefSize(300, 25);
		codeText.setText(code);
		codeText.setEditable(false);
		TextField titleText = new TextField();
		titleText.setEditable(true);
		titleText.setText(title);
		titleText.setPrefSize(300, 25);
		TextField copiesNumberText = new TextField();
		copiesNumberText.setPrefSize(300, 25);
		copiesNumberText.setText(copies);
		copiesNumberText.setEditable(true);
		TextField weightText = new TextField();
		weightText.setPrefSize(300, 25);
		weightText.setText(weight);
		weightText.setEditable(true);

		Image backIcon = new Image(new FileInputStream("back.png"));

		Image homeIcon = new Image(new FileInputStream("home.png"));

		Image updateIcon = new Image(new FileInputStream("update.png"));

		ImageView updateView = new ImageView(updateIcon);
		// to make the image fits good
		updateView.setFitWidth(100);
		updateView.setFitHeight(100);

		ImageView homeView = new ImageView(homeIcon);
		// to make the image fits good
		homeView.setFitWidth(100);
		homeView.setFitHeight(100);

		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(100);
		backView.setFitHeight(100);

		Button back = new Button("", backView);
		Button home = new Button("", homeView);
		Button update = new Button("", updateView);

		back.setOnAction(e -> {
			try {
				updateMediaChecker(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		home.setOnAction(e -> {
			try {
				startScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		update.setOnAction(e -> {

			try {

				if (!codeText.getText().equals(null) && !titleText.getText().equals(null)
						&& !copiesNumberText.getText().equals(null) && !weightText.getText().equals(null)) {
					int d = -404; // checker
					for (int i = 0; i < m.media.size(); i++) {
						if (m.media.get(i).getCode().equalsIgnoreCase(code)) {
							d = i;

						}
						if (d != -404 && m.media.get(d) instanceof Game) {
							processLabel.setText("Game Updated successfully !");

							Game game = (Game) m.media.get(d);

							game.setTitle(titleText.getText().trim());
							if (isDouble(weightText.getText())) {
								game.setWeight(Double.parseDouble(weightText.getText().trim()));

							}
							if (isInteger(copiesNumberText.getText())) {
								game.setNumberOfCopies(Integer.parseInt(copiesNumberText.getText()));

							}
							try {
								mediaRefresh();
								mediaLeftRefresh();
								rentedFile();
								intrestedFile();
							} catch (IOException e1) {

							}

						}

					}
				}
			} catch (NullPointerException e2) {
				processLabel.setText("PLEASE FILL THE FIELDS!!");

			}

		});
		copiesNumberText.setOnKeyTyped(e -> {
			try {
				try {
					if (!isInteger(copiesNumberText.getText().trim())) {
						copiesNumberText.setText(null);
						processLabel.setText("please enter a valid copies number!!!!");
					} else
						processLabel.setText(null);

				} catch (NumberFormatException e2) {
				}
			} catch (NullPointerException e2) {
				copiesNumberText.setText(null);
				processLabel.setText("please enter a valid copies number!!!!");
			}
		});
		weightText.setOnKeyTyped(e -> {
			try {
				if (!isDouble(weightText.getText().trim())) {
					weightText.setText(null);
					processLabel.setText("please enter a valid weight number!!!!");

				} else
					processLabel.setText(null);

			} catch (NumberFormatException e2) {
			}
		});
		codeText.setOnKeyTyped(e -> {
			try {
				if (codeText.getText().trim().equalsIgnoreCase(""))
					codeText.setText(null);

			} catch (NullPointerException e2) {

			}
		});
		titleText.setOnKeyTyped(e -> {

			try {
				if (titleText.getText().trim().equalsIgnoreCase(""))
					titleText.setText(null);

			} catch (NullPointerException e2) {

			}
		});

		HBox box = new HBox();
		box.setSpacing(100);
		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(update, home, back);

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(100)); // to move the nodes out of edge

		pane.setBottom(box);
		GridPane grid = new GridPane();
		grid.setVgap(10);
		grid.setHgap(10);

		grid.add(codeLabel, 0, 0);
		grid.add(codeText, 8, 0);
		grid.add(titleLabel, 0, 2);
		grid.add(titleText, 8, 2);
		grid.add(numberCopiesLabel, 0, 4);
		grid.add(copiesNumberText, 8, 4);
		grid.add(weightLabel, 0, 6);
		grid.add(weightText, 8, 6);
		grid.add(processLabel, 8, 8);

		grid.setAlignment(Pos.CENTER);
		pane.setCenter(grid);

		Scene scene = new Scene(pane, 500, 500);
		mainStage.setTitle("Game Information Page");
		mainStage.setScene(scene);
		mainStage.setMaximized(true);
		mainStage.show();

	}

	private void updateMovieScene(Stage mainStage, String code, String title, String copies, String rating)
			throws FileNotFoundException {
		// Declaring Labels & font size & labelWidth
		Label codeLabel = new Label("Media Code : ");
		codeLabel.setFont(new Font("font", 40)); // to make font Bigger
		codeLabel.setMinWidth(300);

		Label titleLabel = new Label("Movie Title : ");
		titleLabel.setFont(new Font("font", 40));
		titleLabel.setMinWidth(300);

		Label numberCopiesLabel = new Label("Number Of Copies : ");
		numberCopiesLabel.setFont(new Font("font", 40));
		numberCopiesLabel.setMinWidth(350);

		Label ratingLabel = new Label("Rating : ");
		ratingLabel.setFont(new Font("font", 40));
		ratingLabel.setMinWidth(350);

		Label processLabel = new Label("");
		processLabel.setFont(new Font(30));
		processLabel.setMinWidth(350);
		processLabel.setTextFill(Color.RED);

		// Declaring TextFields
		TextField codeText = new TextField();
		codeText.setPrefSize(300, 25);
		codeText.setText(code);
		codeText.setEditable(false);
		TextField titleText = new TextField();
		titleText.setEditable(true);
		titleText.setText(title);
		titleText.setPrefSize(300, 25);
		TextField copiesNumberText = new TextField();
		copiesNumberText.setPrefSize(300, 25);
		copiesNumberText.setText(copies);
		copiesNumberText.setEditable(true);
		TextField ratintgField = new TextField();
		ratintgField.setPrefSize(300, 25);
		ratintgField.setText(rating);
		ratintgField.setEditable(true);

		Image backIcon = new Image(new FileInputStream("back.png"));

		Image homeIcon = new Image(new FileInputStream("home.png"));

		Image updateIcon = new Image(new FileInputStream("update.png"));

		ImageView updateView = new ImageView(updateIcon);
		// to make the image fits good
		updateView.setFitWidth(100);
		updateView.setFitHeight(100);

		ImageView homeView = new ImageView(homeIcon);
		// to make the image fits good
		homeView.setFitWidth(100);
		homeView.setFitHeight(100);

		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(100);
		backView.setFitHeight(100);

		Button back = new Button("", backView);
		Button home = new Button("", homeView);
		Button update = new Button("", updateView);

		back.setOnAction(e -> {
			try {
				updateMediaChecker(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		home.setOnAction(e -> {
			try {
				startScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		update.setOnAction(e -> {

			try {
				if (!codeText.getText().equals(null) && !titleText.getText().equals(null)
						&& !copiesNumberText.getText().equals(null) && !ratintgField.getText().equals(null)) {
					int d = -404; // checker
					for (int i = 0; i < m.media.size(); i++) {
						if (m.media.get(i).getCode().equalsIgnoreCase(code)) {
							d = i;

						}
						if (d != -404 && m.media.get(d) instanceof Movie) {
							processLabel.setText("Movie Updated successfully !");

							Movie movie = (Movie) m.media.get(d);

							movie.setTitle(titleText.getText().trim());
							movie.setRating(ratintgField.getText().trim());
							if (isInteger(copiesNumberText.getText())) {
								movie.setNumberOfCopies(Integer.parseInt(copiesNumberText.getText()));

							}
							try {
								mediaRefresh();
								mediaLeftRefresh();
								rentedFile();
								intrestedFile();
							} catch (IOException e1) {

							}

						}

					}
				}

			} catch (NullPointerException e2) {
				processLabel.setText("PLEASE FILL THE FIELDS!!");

			}

		});

		copiesNumberText.setOnKeyTyped(e -> {
			try {
				if (!isInteger(copiesNumberText.getText().trim())) {
					copiesNumberText.setText(null);
					processLabel.setText("please enter a valid copies number!!!!");
				} else
					processLabel.setText(null);

			} catch (NumberFormatException e2) {
			}
		});
		codeText.setOnKeyTyped(e -> {
			try {
				if (codeText.getText().trim().equalsIgnoreCase(""))
					codeText.setText(null);

			} catch (NullPointerException e2) {

			}
		});
		titleText.setOnKeyTyped(e -> {

			try {
				if (titleText.getText().trim().equalsIgnoreCase(""))
					titleText.setText(null);

			} catch (NullPointerException e2) {

			}
		});
		ratintgField.setOnKeyTyped(e -> {

			try {
				if (ratintgField.getText().trim().equalsIgnoreCase(""))
					ratintgField.setText(null);

			} catch (NullPointerException e2) {

			}
		});

		HBox box = new HBox();
		box.setSpacing(100);
		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(update, home, back);

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(100)); // to move the nodes out of edge

		pane.setBottom(box);
		GridPane grid = new GridPane();
		grid.setVgap(10);
		grid.setHgap(10);

		grid.add(codeLabel, 0, 0);
		grid.add(codeText, 8, 0);
		grid.add(titleLabel, 0, 2);
		grid.add(titleText, 8, 2);
		grid.add(numberCopiesLabel, 0, 4);
		grid.add(copiesNumberText, 8, 4);
		grid.add(ratingLabel, 0, 6);
		grid.add(ratintgField, 8, 6);
		grid.add(processLabel, 8, 8);

		grid.setAlignment(Pos.CENTER);
		pane.setCenter(grid);

		Scene scene = new Scene(pane, 500, 500);
		mainStage.setTitle("Movie Update Page");
		mainStage.setScene(scene);
		mainStage.setMaximized(true);
		mainStage.show();

	}

	private void updateAlbumScene(Stage mainStage, String code, String title, String copies, String artist,
			String songs) throws FileNotFoundException {
		// Declaring Labels & font size & labelWidth
		Label codeLabel = new Label("Album Code : ");
		codeLabel.setFont(new Font("font", 40)); // to make font Bigger
		codeLabel.setMinWidth(300);

		Label titleLabel = new Label("Album Title : ");
		titleLabel.setFont(new Font("font", 40));
		titleLabel.setMinWidth(300);

		Label numberCopiesLabel = new Label("Number Of Copies : ");
		numberCopiesLabel.setFont(new Font("font", 40));
		numberCopiesLabel.setMinWidth(350);

		Label artistLabel = new Label("Album Artist : ");
		artistLabel.setFont(new Font("font", 40));
		artistLabel.setMinWidth(350);

		Label songsLabel = new Label("Album songs : ");
		songsLabel.setFont(new Font("font", 40));
		songsLabel.setMinWidth(350);

		Label processLabel = new Label("");
		processLabel.setFont(new Font(30));
		processLabel.setMinWidth(350);
		processLabel.setTextFill(Color.RED);
		// Declaring TextFields
		TextField codeText = new TextField();
		codeText.setPrefSize(300, 25);
		codeText.setText(code);
		codeText.setEditable(false);

		TextField titleText = new TextField();
		titleText.setPrefSize(300, 25);
		titleText.setText(title);
		titleText.setEditable(true);
		TextField copiesNumberText = new TextField();
		copiesNumberText.setPrefSize(300, 25);
		copiesNumberText.setText(copies);
		copiesNumberText.setEditable(true);
		TextField artistText = new TextField();
		artistText.setPrefSize(300, 25);
		artistText.setText(artist);
		artistText.setEditable(true);
		TextField songsText = new TextField();
		songsText.setPrefSize(300, 25);
		songsText.setText(songs);
		songsText.setEditable(true);

		Image backIcon = new Image(new FileInputStream("back.png"));

		Image homeIcon = new Image(new FileInputStream("home.png"));

		Image updateIcon = new Image(new FileInputStream("update.png"));

		ImageView updateView = new ImageView(updateIcon);
		// to make the image fits good
		updateView.setFitWidth(100);
		updateView.setFitHeight(100);

		ImageView homeView = new ImageView(homeIcon);
		// to make the image fits good
		homeView.setFitWidth(100);
		homeView.setFitHeight(100);

		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(100);
		backView.setFitHeight(100);

		Button back = new Button("", backView);

		Button home = new Button("", homeView);

		Button update = new Button("", updateView);

		back.setOnAction(e -> {
			try {
				updateMediaChecker(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		home.setOnAction(e -> {
			try {
				startScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});
		update.setOnAction(e -> {
			try {
				if (!codeText.getText().equals(null) && !titleText.getText().equals(null)
						&& !copiesNumberText.getText().equals(null) && !artistText.getText().equals(null)
						&& !songsText.getText().equals(null)) {
					int d = -404; // checker
					for (int i = 0; i < m.media.size(); i++) {
						if (m.media.get(i).getCode().equalsIgnoreCase(code)) {
							d = i;

						}
						if (d != -404 && m.media.get(d) instanceof Album) {
							processLabel.setText("Album Updated successfully !");
							Album album = (Album) m.media.get(d);

							if (isInteger(copiesNumberText.getText().trim())) {
								album.setNumberOfCopies(Integer.parseInt(copiesNumberText.getText()));
							}
							album.setTitle(titleText.getText().trim());
							album.setArtist(artistText.getText().trim());
							album.setSongs(songsText.getText().trim());
							try {
								mediaRefresh();
								mediaLeftRefresh();
								rentedFile();
								intrestedFile();
							} catch (IOException e1) {

							}

						}

					}

				}

			} catch (NullPointerException e2) {
				processLabel.setText("PLEASE FILL THE FIELDS!!");

			}

		});

		copiesNumberText.setOnKeyTyped(e -> {
			try {
				if (!isInteger(copiesNumberText.getText().trim())) {
					copiesNumberText.setText(null);
					processLabel.setText("please enter a valid copies number!!!!");
				} else
					processLabel.setText(null);

			} catch (NumberFormatException e2) {
			}
		});
		codeText.setOnKeyTyped(e -> {
			try {
				if (codeText.getText().trim().equalsIgnoreCase(""))
					codeText.setText(null);

			} catch (NullPointerException e2) {

			}
		});
		titleText.setOnKeyTyped(e -> {

			try {
				if (titleText.getText().trim().equalsIgnoreCase(""))
					titleText.setText(null);

			} catch (NullPointerException e2) {

			}
		});
		artistText.setOnKeyTyped(e -> {

			try {
				if (artistText.getText().trim().equalsIgnoreCase(""))
					artistText.setText(null);

			} catch (NullPointerException e2) {

			}
		});
		songsText.setOnKeyTyped(e -> {

			try {
				if (songsText.getText().trim().equalsIgnoreCase(""))
					songsText.setText(null);

			} catch (NullPointerException e2) {

			}
		});

		HBox box = new HBox();
		box.setSpacing(100);
		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(update, home, back);

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(100)); // to move the nodes out of edge

		pane.setBottom(box);
		GridPane grid = new GridPane();
		grid.setVgap(10);
		grid.setHgap(10);

		grid.add(codeLabel, 0, 0);
		grid.add(codeText, 8, 0);
		grid.add(titleLabel, 0, 2);
		grid.add(titleText, 8, 2);
		grid.add(numberCopiesLabel, 0, 4);
		grid.add(copiesNumberText, 8, 4);
		grid.add(artistLabel, 0, 6);
		grid.add(artistText, 8, 6);
		grid.add(songsLabel, 0, 8);
		grid.add(songsText, 8, 8);
		grid.add(processLabel, 8, 10);
		grid.setAlignment(Pos.CENTER);
		pane.setCenter(grid);

		Scene scene = new Scene(pane, 500, 500);
		mainStage.setTitle("Album Information Page");
		mainStage.setScene(scene);
		mainStage.setMaximized(true);
		mainStage.show();

	}

	private void printAllMedia(Stage mainStage) throws FileNotFoundException {
		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(100)); // to have space from edge
		VBox stack = new VBox();

		Image backIcon = new Image(new FileInputStream("back.png"));
		Image homeIcon = new Image(new FileInputStream("home.png"));
		Image processIcon = new Image(new FileInputStream("maintenance.png"));

		ImageView processView = new ImageView(processIcon);
		// to make the image fits good
		processView.setFitWidth(100);
		processView.setFitHeight(100);

		ImageView homeView = new ImageView(homeIcon);
		// to make the image fits good
		homeView.setFitWidth(100);
		homeView.setFitHeight(100);

		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(100);
		backView.setFitHeight(100);

		Label label = new Label("Media Information : ");
		label.setFont(new Font(30));

		TextArea text = new TextArea();
		text.setEditable(false);

		Button back = new Button("", backView);
		Button home = new Button("", homeView);
		Button process = new Button("", processView);

		stack.getChildren().addAll(label, process, back, home);
		stack.setSpacing(40);
		stack.setAlignment(Pos.CENTER_LEFT);
		back.setOnAction(e -> {
			try {
				mediaScene(mainStage);
				mainStage.setMaximized(true);
			} catch (FileNotFoundException e1) {

			}

		});
		home.setOnAction(e -> {

			try {
				startScene(mainStage);
				mainStage.setMaximized(true);
			} catch (FileNotFoundException e1) {

			}

		});
		process.setOnAction(e -> {
			String string = "";
			for (int i = 0; i < m.media.size(); i++) {
				if (m.media.get(i) instanceof Game) {
					Game game = (Game) m.media.get(i);
					string += "Game :" + "Title :  " + game.getTitle() + "  ,  " + "Code :  " + game.getCode() + "  ,  "
							+ "Copies Available:  " + game.getNumberOfCopies() + "  ,  " + "Weigh : " + game.getWeight()
							+ '\t' + '\n';

				}
				if (m.media.get(i) instanceof Album) {
					Album album = (Album) m.media.get(i);
					string += "Album :" + "Title :  " + album.getTitle() + "  ,  " + "Code :  " + album.getCode()
							+ "  ,  " + "Copies Available :  " + album.getNumberOfCopies() + "  ,  " + "Artist : "
							+ album.getArtist() + "  ,  " + "Songs : " + album.getSongs() + '\t' + '\n';

				}
				if (m.media.get(i) instanceof Movie) {
					Movie movie = (Movie) m.media.get(i);
					string += "Movie :" + "Title :  " + movie.getTitle() + "  ,  " + "Code :  " + movie.getCode()
							+ "  ,  " + "Copies Available:  " + movie.getNumberOfCopies() + "  ,  " + "Rating : "
							+ movie.getRating() + '\t' + '\n';

				}

			}
			text.setText(string);
			text.setFont(new Font(20));
		});

		pane.setLeft(stack);
		pane.setCenter(text);

		Scene scene = new Scene(pane, 300, 500);
		mainStage.setMaximized(true);
		mainStage.setTitle("Media Information");
		mainStage.setScene(scene);
		mainStage.show();

	}

	private void rentScene(Stage mainStage) throws FileNotFoundException {
		// Declaring Labels & font size & labelWidth
		Label cutomerIdLabel = new Label("Customer Id : ");
		cutomerIdLabel.setFont(new Font(30)); // to make font Bigger

		Label mediaCodeLabel = new Label("Media Code : ");
		mediaCodeLabel.setFont(new Font(30));

		Label dateLabel = new Label("Rented Date : ");
		dateLabel.setFont(new Font(30));

		ComboBox<String> cIdBox = new ComboBox<String>();
		for (int i = 0; i < m.customers.size(); i++) {
			cIdBox.getItems().add(m.customers.get(i).getName() + " , " + m.customers.get(i).getID());

		}
		cIdBox.setPromptText("----- Select The Customer -----");

		ComboBox<String> mediaCodeBox = new ComboBox<String>();
		for (int i = 0; i < m.media.size(); i++) {
			mediaCodeBox.getItems().add(m.media.get(i).getTitle() + " , " + m.media.get(i).getCode());

		}
		mediaCodeBox.setPromptText("----- Select Media Code -----");

		TextArea cInfo = new TextArea();
		cInfo.setPrefSize(400, 200);
		cInfo.setEditable(false);

		TextArea mInfo = new TextArea();
		mInfo.setPrefSize(200, 200);
		mInfo.setEditable(false);
		TextField dateReader = new TextField();
		dateReader.setPrefSize(250, 25);
		dateReader.setEditable(false);
		dateReader.setMaxWidth(250);

		// adding images for background of buttons
		// the photos are in the folder
		Image backIcon = new Image(new FileInputStream("back.png"));
		Image addIcon = new Image(new FileInputStream("add-to-cart.png"));
		Image processIcon = new Image(new FileInputStream("maintenance.png"));
		Image returnIcon = new Image(new FileInputStream("return.png"));

		ImageView returnView = new ImageView(returnIcon);
		// to make the image fits good
		returnView.setFitWidth(80);
		returnView.setFitHeight(80);

		ImageView processView = new ImageView(processIcon);
		// to make the image fits good
		processView.setFitWidth(80);
		processView.setFitHeight(80);

		ImageView backView = new ImageView(backIcon);
		// to make the image fits good
		backView.setFitWidth(100);
		backView.setFitHeight(100);

		ImageView addView = new ImageView(addIcon);
		// to make the image fits good
		addView.setFitWidth(80);
		addView.setFitHeight(80);

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(10)); // to have space from edge

		GridPane grid = new GridPane();
		grid.setVgap(10);
		grid.setHgap(10);

		grid.add(cutomerIdLabel, 0, 0);
		grid.add(cIdBox, 8, 0);
		grid.add(cInfo, 8, 4);
		grid.add(mediaCodeLabel, 0, 6);
		grid.add(mediaCodeBox, 8, 6);
		grid.add(mInfo, 8, 8);

		grid.add(dateLabel, 0, 12);

		grid.add(dateReader, 8, 12);

		Button back = new Button("", backView);
		Button addToCart = new Button("", addView);
		Button process = new Button("", processView);
		Button returnItem = new Button("", returnView);

		StackPane stack = new StackPane();
		stack.getChildren().add(back);
		stack.setAlignment(Pos.BOTTOM_RIGHT);

		HBox box = new HBox();
		box.setSpacing(100);
		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(addToCart, process, returnItem);

		pane.setBottom(box);
		pane.setRight(stack);

		grid.setAlignment(Pos.CENTER);
		pane.setCenter(grid);

		back.setOnAction(e -> {
			try {
				startScene(mainStage);
				mainStage.setMaximized(true); // to get back to full screen

			} catch (FileNotFoundException e1) {

			}

		});

		///////////////////
		returnItem.setOnAction(e -> {

			try {
				String customerBox = cIdBox.getValue().trim();
				String[] cArray = customerBox.split(",");
				String mediaBox = mediaCodeBox.getValue().trim();
				String[] mArray = mediaBox.split(",");

				if (!cIdBox.equals(null) && !mediaCodeBox.equals(null)) {

					if (m.returnMedia(cArray[1].trim(), mArray[1].trim())) {

						cInfo.setText("Item Returned");
						mInfo.setText("Item Returned");
						mInfo.setFont(new Font(20));
						cInfo.setFont(new Font(20));

						// to refresh files
						try {
							intrestedFile();
							rentedFile();
							mediaLeftRefresh();
							mediaRefresh();
							customerLeftRefresh();
							customerRefresh();
						} catch (IOException e1) {

						}

					} else {
						cInfo.setText(" Process Failed  ");
						mInfo.setText(" Process Failed ( due to item not RENTED ) ");
						mInfo.setFont(new Font(20));
						cInfo.setFont(new Font(20));
					}
				}

			} catch (NullPointerException e2) {

			}

		});

		/////////////////////

		addToCart.setOnAction(e ->

		{

			try {
				String customerBox = cIdBox.getValue().trim();
				String[] cArray = customerBox.split(",");
				String mediaBox = mediaCodeBox.getValue().trim();
				String[] mArray = mediaBox.split(",");

				if (!cIdBox.equals(null) && !mediaCodeBox.equals(null)) {
					if (!m.customers.get(Integer.parseInt(cArray[1].trim())).getInterested()
							.contains(mArray[1].trim())) { // to avoid repeatation
						m.addToCart(cArray[1].trim(), mArray[1]);
						int d = -404; // checker
						for (int i = 0; i < m.customers.size(); i++) {
							if (m.customers.get(i).getID().equalsIgnoreCase(cArray[1].trim())) {
								d = i;

							}
						}
						if (d != -404) {

							Customer customer = m.customers.get(d);
							String s = "";
							s += "Name: " + customer.getName() + " , " + " ID :" + customer.getID() + '\n'
									+ " Address :" + customer.getAddress() + " , " + '\n' + " Rented : " + '\n' + '\t'
									+ '\t';

							for (int i = 0; i < m.customers.get(d).getRented().size(); i++) {

								s += m.customers.get(d).getRented().get(i).getTitle() + " , "
										+ m.customers.get(d).getRented().get(i).getCode() + '\n' + '\t' + '\t';

							}
							s += '\n' + "Interested Items : " + '\n' + '\t' + '\t';
							for (int i = 0; i < m.customers.get(d).getInterested().size(); i++) {

								s += m.customers.get(d).getInterested().get(i) + '\n' + '\t' + '\t';

							}

							cInfo.setText(s);

							dateReader.setText(new Date().toString());

						}
						int t = -404; // checker
						for (int i = 0; i < m.media.size(); i++) {
							if (m.media.get(i).getCode().equalsIgnoreCase(mArray[1].trim())) {
								t = i;

							}
						}
						if (t != -404) {
							String string = "";

							if (m.media.get(t) instanceof Game) {
								Game game = (Game) m.media.get(t);
								string += "Game :" + "Title :  " + game.getTitle() + "  ,  " + "Code :  "
										+ game.getCode() + '\n' + "Copies Available:  " + game.getNumberOfCopies()
										+ '\n' + "Weigh : " + game.getWeight();

							}
							if (m.media.get(t) instanceof Album) {
								Album album = (Album) m.media.get(t);
								string += "Album :" + "Title :  " + album.getTitle() + "  ,  " + "Code :  "
										+ album.getCode() + '\n' + "Copies Available :  " + album.getNumberOfCopies()
										+ "  ,  " + "Artist : " + album.getArtist() + '\n' + "Songs : "
										+ album.getSongs() + '\t' + '\n';

							}
							if (m.media.get(t) instanceof Movie) {
								Movie movie = (Movie) m.media.get(t);
								string += "Movie :" + "Title :  " + movie.getTitle() + "  ,  " + "Code :  "
										+ movie.getCode() + '\n' + "Copies Available:  " + movie.getNumberOfCopies()
										+ "  ,  " + "Rating : " + movie.getRating() + '\t' + '\n';

							}
							mInfo.setText(string);
							mInfo.setFont(new Font(20));
							try {
								intrestedFile();
								rentedFile();
								mediaLeftRefresh();
								mediaRefresh();
								customerLeftRefresh();
								customerRefresh();
							} catch (IOException e1) {

							}
						}

					}
					else { mInfo.setText("Item Already intrested");
					cInfo.setText("");
					}

				}
			} catch (NullPointerException e2) {

			}

		});
		process.setOnAction(e -> {
			m.processRequests();
			try {

				mInfo.setText("");

				String customerBox = cIdBox.getValue().trim();
				String[] cArray = customerBox.split(",");

				m.processRequests2();

				int d = -404; // checker
				for (int i = 0; i < m.customers.size(); i++) {
					if (m.customers.get(i).getID().equalsIgnoreCase(cArray[1].trim())) {
						d = i;

					}
				}
				if (d != -404) {

					Customer customer = m.customers.get(d);
					String s = "";
					s += "Name: " + customer.getName() + " , " + " ID :" + customer.getID() + '\n' + " Address :"
							+ customer.getAddress() + " , " + " Intrested: " + customer.getInterested() + '\n'
							+ " Rented : " + '\n' + '\t' + '\t';

					for (int i = 0; i < m.customers.get(d).getRented().size(); i++) {

						s += m.customers.get(d).getRented().get(i).getTitle() + " , "
								+ m.customers.get(d).getRented().get(i).getCode() + '\n' + '\t' + '\t';

					}
					cInfo.setText(s);

				}
				int t = -404; // checker
				for (int i = 0; i < m.media.size(); i++) {
					if (m.media.get(i).getCode().equalsIgnoreCase(mediaCodeBox.getValue().trim())) {
						t = i;

					}
				}
				if (t != -404) {
					String string = "";

					if (m.media.get(t) instanceof Game) {
						Game game = (Game) m.media.get(t);
						string += "Game :" + "Title :  " + game.getTitle() + "  ,  " + "Code :  " + game.getCode()
								+ '\n' + "Copies Available:  " + game.getNumberOfCopies() + '\n' + "Weigh : "
								+ game.getWeight() + '\n';

					}
					if (m.media.get(t) instanceof Album) {
						Album album = (Album) m.media.get(t);
						string += "Album :" + "Title :  " + album.getTitle() + "  ,  " + "Code :  " + album.getCode()
								+ '\n' + "Copies Available :  " + album.getNumberOfCopies() + "  ,  " + "Artist : "
								+ album.getArtist() + '\n' + "Songs : " + album.getSongs() + '\t' + '\n';

					}
					if (m.media.get(t) instanceof Movie) {
						Movie movie = (Movie) m.media.get(t);
						string += "Movie :" + "Title :  " + movie.getTitle() + "  ,  " + "Code :  " + movie.getCode()
								+ '\n' + "Copies Available:  " + movie.getNumberOfCopies() + "  ,  " + "Rating : "
								+ movie.getRating() + '\t' + '\n';

					}
					mInfo.setText(string);
					mInfo.setFont(new Font(20));

				}
			} catch (NullPointerException e2) {

				cInfo.setText(" Process Failed  ");
				mInfo.setText(" Process Failed ( PLEASE FILL THE BOXES ) ");
				mInfo.setFont(new Font(20));
				cInfo.setFont(new Font(20));
			}
			try {
				intrestedFile();
				rentedFile();
				mediaLeftRefresh();
				mediaRefresh();
				customerLeftRefresh();
				customerRefresh();
			} catch (IOException e1) {

			}
			dateReader.setText(new Date().toString());
		});

		Scene scene = new Scene(pane, 500, 500);
		mainStage.setTitle("Rent Page");
		mainStage.setScene(scene);
		mainStage.setMaximized(true);
		mainStage.show();

	}

	boolean isInteger(String string) {
		// a method checks if the string is integer
		try {
			int num = Integer.parseInt(string);
			return true;

		} catch (NumberFormatException e) {

		}
		return false;
	}

	private boolean isDouble(String string) {
		// a method to check if the string is double

		try {
			Double num = Double.parseDouble(string);
			return true;

		} catch (NumberFormatException e) {

		}
		return false;
	}

	static MediaRentalManger m = new MediaRentalManger();

	public static void main(String[] args) throws IOException {
		ArrayList<String> cID = new ArrayList<>();
		// CUSTOMERS TEXT FILE READ BEGINS

		File cust = new File("customersLeftLimited.txt"); // reading customers and store them
		Scanner scanner = new Scanner(cust);

		while (scanner.hasNextLine()) {
			// read the customers with last customers in their last limited
			String line = scanner.nextLine();
			String[] array = line.split(",");
			if (array.length == 5) {
				if (!cID.contains(array[3].trim())) {
					m.customers.add(new Customer(array[0].trim(), array[1].trim(), array[2].trim(), array[3].trim(),
							array[4].trim(), null));
					cID.add(array[3].trim());

				}
			} else if (array.length == 6) {
				if (!cID.contains(array[3].trim())) {
					m.customers.add(new Customer(array[0].trim(), array[1].trim(), array[2].trim(), array[3].trim(),
							array[4].trim(), array[5].trim()));
					cID.add(array[3].trim());

				}

			}

		}

		// CUSTOMER TEXT FILE READING FINISHED

		// MEDIA FILE READING BEGINS

		File file = new File("mediaLeft.txt"); // with the file with last copies
		Scanner scan = new Scanner(file);

		// to read media file and store it

		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] array = line.split(",");

			if (array.length == 6) {
				m.media.add(new Album(array[1].trim(), Integer.parseInt(array[2].trim()), array[3].trim(),
						array[4].trim(), array[5].trim()));

			} else if (array.length == 5) {

				if (array[0].trim().equalsIgnoreCase("Game")) {
					// checkMedia.add(m.media.get(i).getTitle() + array[0]);
					m.media.add(new Game(array[1].trim(), Integer.parseInt(array[2].trim()), array[3].trim(),
							Double.parseDouble(array[4].trim())));

				} else if (array[0].trim().equalsIgnoreCase("Movie")) {
					// checkMedia.add(m.media.get(i).getTitle() + array[0]);
					m.media.add(new Movie(array[1].trim(), Integer.parseInt(array[2].trim()), array[3].trim(),
							array[4].trim()));

				}

			}

		}

		// MEDIA FILE READING FINISHED

		// INTRESTED FILE READING BEGINS

		File intrest = new File("intrested.txt");
		// reading from file to add into intrested for every customer
		Scanner intScan = new Scanner(intrest);
		while (intScan.hasNextLine()) { // to read intrested and store it
			String line = intScan.nextLine().trim();
			String[] array = line.split(",");

			if (array.length == 2) {
				for (int i = 0; i < m.customers.size(); i++) {
					if (m.customers.get(i).getID().equalsIgnoreCase(array[0].trim())) {
						m.addToCart(array[0].trim(), array[1].trim());

					}

				}

			}

		}

		// INTRESTED FILE READING FINISHED

		// BY REMOVING previous intrested that MAY BEREMVED FROM CART LATER AFTER
		// PROCESS

		// RENTED FILE READING BEGINS

		File rent = new File("Rented.txt");
		Scanner scanRent = new Scanner(rent);
		// to read rented file and store it

		while (scanRent.hasNextLine()) {
			String line = scanRent.nextLine();
			String[] array = line.split(",");
			if (array.length == 8 || array.length == 7 || array.length == 6) {
				// to avoid the reading errors while the maximum texts in the line spreaded by
				// ',' is 8

				int d = -404;// to get the id of media

				for (int i = 0; i < m.media.size(); i++) {
					if (m.media.get(i).getCode().equalsIgnoreCase(array[5].trim()))
						d = i;

				}

				for (int i = 0; i < m.customers.size(); i++) {
					if (array[0].trim().equalsIgnoreCase(m.customers.get(i).getID())) {
						m.customers.get(i).getRented().add(m.media.get(d));

					}

				}

			}

		}

		writeText("Rented.txt", "", false); // to remove text from file to re type it next

		// RENTED FILE READING FINISHED

		// WAS BEFORE

		/*
		 * try { for (int i = 0; i < m.customers.size(); i++) {
		 * 
		 * 
		 * File fOut = new File("Rented.txt"); FileWriter writer = new FileWriter(fOut,
		 * true); PrintWriter printWriter = new PrintWriter(writer);
		 * printWriter.println(m.customers.get(i).getName() + " " +
		 * m.customers.get(i).getRented()); printWriter.close(); File fIntrested = new
		 * File("intrested.txt"); FileWriter wINTR = new FileWriter(fIntrested, true);
		 * PrintWriter printWriterred = new PrintWriter(wINTR);
		 * printWriterred.println(m.customers.get(i).getName() + " " +
		 * m.customers.get(i).getInterested()); printWriterred.close();
		 * 
		 * } } catch (Exception exception) {
		 * 
		 * 
		 * }
		 */
		// was in the phase one before update

		// intrestedFile(); // TO GET INTRESTED FILE

		rentedFile(); // to add THE TEXT to the rented file
		writeText("mediaLeft.txt", "", false);// creating new file to see left media
		// delete previous data from mediaLeft.txt

		// WRITING ON mediaLeft.txt DATA ADDING BEGINS
		for (int i = 0; i < m.media.size(); i++) {
			if (m.media.get(i) instanceof Movie) {
				writeText("mediaLeft.txt",
						"Movie ," + m.media.get(i).getTitle() + " , " + m.media.get(i).getNumberOfCopies() + ","
								+ m.media.get(i).getCode() + " , " + ((Movie) m.media.get(i)).rating.trim(),
						true);
			} else if (m.media.get(i) instanceof Album) {
				writeText("mediaLeft.txt",
						"Album ," + m.media.get(i).getTitle().trim() + " , " + m.media.get(i).getNumberOfCopies() + ","
								+ m.media.get(i).getCode() + " , " + ((Album) m.media.get(i)).getArtist().trim() + " , "
								+ ((Album) m.media.get(i)).getSongs(),
						true);
			} else if (m.media.get(i) instanceof Game) {
				writeText("mediaLeft.txt",
						"Game ," + m.media.get(i).getTitle().trim() + " , " + m.media.get(i).getNumberOfCopies() + ","
								+ m.media.get(i).getCode() + " , " + ((Game) m.media.get(i)).getWeight(),
						true);
			}

		}

		// ADDING DATA ON mediaLeft.txt FINISHED
		// writeText("intrested.txt", " ", false); // to refresh intrested file text
		intrestedFile(); // TO GET INTRESTED FILE

		// WRITING ON customersLeftLimited.txt DATA ADDING BEGINS
		writeText("customersLeftLimited.txt", "", false); // to refresh the file
		for (int i = 0; i < m.customers.size(); i++) {
			// a for loop to print customers with new limited for limited plans and store it
			// in new file
			Customer customer = m.customers.get(i);
			if (customer.getPlan().equalsIgnoreCase("unlimited")) {
				writeText("customersLeftLimited.txt",
						customer.getName().trim() + "," + customer.getAddress().trim() + ","
								+ customer.getPlan().trim().toLowerCase() + "," + customer.getID() + ","
								+ customer.getMobileNumber(),
						true);
			} else if (customer.getPlan().trim().equalsIgnoreCase("limited")) {

				writeText("customersLeftLimited.txt",
						customer.getName().trim() + "," + customer.getAddress().trim() + ","
								+ customer.getPlan().trim().toLowerCase() + "," + customer.getID() + ","
								+ customer.getMobileNumber() + "," + customer.getLimited(),
						true);

			}

		}

		// // ADDING DATA ON customersLeftLimited.txt FINISHED

		launch(args);

	}

	private static void customerRefresh() throws IOException {
		writeText("customers.txt", "", false);

		for (int i = 0; i < m.customers.size(); i++) {
			Customer customer = m.customers.get(i);

			if (customer.getPlan().equalsIgnoreCase("unlimited")) {
				writeText("customers.txt",
						customer.getName().trim() + "," + customer.getAddress().trim() + ","
								+ customer.getPlan().trim().toLowerCase() + "," + customer.getID() + ","
								+ customer.getMobileNumber(),
						true);

			} else if (customer.getPlan().equalsIgnoreCase("limited")) {

				writeText("customers.txt",
						customer.getName().trim() + "," + customer.getAddress().trim() + ","
								+ customer.getPlan().trim().toLowerCase() + "," + customer.getID().trim() + ","
								+ customer.getMobileNumber() + "," + customer.getLimited(),
						true);

			}
		}
	}

	public static void mediaLeftRefresh() throws IOException {
		writeText("mediaLeft.txt", "", false);// creating new file to see left media
		// delete previous data from mediaLeft.txt

		// WRITING ON mediaLeft.txt DATA ADDING BEGINS
		for (int i = 0; i < m.media.size(); i++) {
			if (m.media.get(i) instanceof Movie) {
				writeText("mediaLeft.txt",
						"Movie ," + m.media.get(i).getTitle() + " , " + m.media.get(i).getNumberOfCopies() + ","
								+ m.media.get(i).getCode() + " , " + ((Movie) m.media.get(i)).rating.trim(),
						true);
			} else if (m.media.get(i) instanceof Album) {
				writeText("mediaLeft.txt",
						"Album ," + m.media.get(i).getTitle().trim() + " , " + m.media.get(i).getNumberOfCopies() + ","
								+ m.media.get(i).getCode() + " , " + ((Album) m.media.get(i)).getArtist().trim() + " , "
								+ ((Album) m.media.get(i)).getSongs(),
						true);
			} else if (m.media.get(i) instanceof Game) {
				writeText("mediaLeft.txt",
						"Game ," + m.media.get(i).getTitle().trim() + " , " + m.media.get(i).getNumberOfCopies() + ","
								+ m.media.get(i).getCode() + " , " + ((Game) m.media.get(i)).getWeight(),
						true);
			}

		}

	}

	public static void mediaRefresh() throws IOException {
		writeText("media.txt", "", false);

		for (int i = 0; i < m.media.size(); i++) {
			Media media = m.media.get(i);

			if (media instanceof Movie) {
				Movie movie = (Movie) media;
				writeText("media.txt", "Movie ," + movie.getTitle().trim() + " , " + movie.getNumberOfCopies() + ","
						+ movie.getCode() + " , " + movie.getRating().trim(), true);

			} else if (media instanceof Album) {
				Album album = (Album) media;
				writeText("media.txt", "Album ," + album.getTitle().trim() + " , " + album.getNumberOfCopies() + ","
						+ album.getCode() + " , " + album.getArtist().trim() + " , " + album.getSongs(), true);
			} else if (media instanceof Game) {
				Game game = (Game) media;
				writeText("media.txt", "Game ," + game.getTitle().trim() + " , " + game.getNumberOfCopies() + ","
						+ game.getCode() + " , " + game.getWeight(), true);

			}
		}

	}

	private static void customerLeftRefresh() {
		try {
			writeText("customersLeftLimited.txt", "", false);

		} catch (IOException e1) {

		} // to refresh the file
		for (int i = 0; i < m.customers.size(); i++) {
			// a for loop to print customers with new limited for limited plans and store it
			// in new file
			Customer customer = m.customers.get(i);
			if (customer.getPlan().equalsIgnoreCase("unlimited")) {
				try {
					writeText("customersLeftLimited.txt",
							customer.getName().trim() + "," + customer.getAddress().trim() + ","
									+ customer.getPlan().trim().toLowerCase() + "," + customer.getID() + ","
									+ customer.getMobileNumber(),
							true);

				} catch (IOException e1) {

				}
			} else if (customer.getPlan().trim().equalsIgnoreCase("limited")) {

				try {
					writeText("customersLeftLimited.txt",
							customer.getName().trim() + "," + customer.getAddress().trim() + ","
									+ customer.getPlan().trim().toLowerCase() + "," + customer.getID() + ","
									+ customer.getMobileNumber() + "," + customer.getLimited(),
							true);

				} catch (IOException e1) {

				}
			}
		}

	}

	public static void searchCustomerButton(String id, TextField idText, TextField nameText, TextField planField,
			TextField limitedField, TextField addressText, TextField mobileText) {
		int d = -404; // checker
		for (int i = 0; i < m.customers.size(); i++) {
			if (m.customers.get(i).getID().equalsIgnoreCase(id))
				d = i;

		}
		if (d != -404) {
			idText.setText(id);
			nameText.setText(m.customers.get(d).getName());
			planField.setText(m.customers.get(d).getPlan());
			if (m.customers.get(d).getPlan().equalsIgnoreCase("limited")) {
				limitedField.setText(Integer.toString(m.customers.get(d).getLimited()));

			} else
				limitedField.setText("unlimited :)");
			addressText.setText(m.customers.get(d).getAddress());
			mobileText.setText(m.customers.get(d).getMobileNumber());

		}

	}

	public static void searchGameButton(String code, TextField codeFiled, TextField title, TextField copies,
			TextField weight) {
		int d = -404; // checker
		for (int i = 0; i < m.media.size(); i++) {
			if (m.media.get(i).getCode().equalsIgnoreCase(code))
				d = i;

		}
		Media game = m.media.get(d);
		if (d != -404) {
			if (game instanceof Game) {
				codeFiled.setText(code);
				title.setText(game.getTitle());
				copies.setText(Integer.toString(game.getNumberOfCopies()));
				weight.setText(Double.toString(((Game) game).getWeight()));

			}

		}

	}

	public static void searchMovieButton() {

	}

	public static void searchAlbumButton() {

	}

	public static void writeText(String filneName, String text, boolean append) throws IOException {
		// static method to write strings to the file
		// the boolean all f its true it will keep the previous data
		// else if false it will only print the new data
		File fOut = new File(filneName);
		FileWriter writer = new FileWriter(fOut, append);
		PrintWriter printWriter = new PrintWriter(writer);
		printWriter.println(text);
		printWriter.close();

	}

	private static void intrestedFile() throws IOException { // extra method to get intrested text file
		writeText("intrested.txt", "", false);

		for (int i = 0; i < m.customers.size(); i++) {

			for (int j = 0; j < m.customers.get(i).getInterested().size(); j++) {
				writeText("intrested.txt",
						m.customers.get(i).getID() + " , " + m.customers.get(i).getInterested().get(j), true);

			}

		}

	}

	private static void rentedFile() throws IOException {
		writeText("Rented.txt", " ", false);

		for (int i = 0; i < m.customers.size(); i++) {
			for (int j = 0; j < m.customers.get(i).getRented().size(); j++) {

				writeText("Rented.txt", m.customers.get(i).getID() + "," + m.customers.get(i).getName() + ", "
						+ m.customers.get(i).getRented().get(j), true);
			}

		}
	}

	public static void addingCustomerProgram(String name, String address, String plan, String id, String mobile,
			String limited) {

		int d = -404; // checker
		for (int i = 0; i < m.customers.size(); i++) {
			if (m.customers.get(i).getID().equalsIgnoreCase(id.trim()))
				d = i;
		}
		if (d == -404) {
			if (plan.equalsIgnoreCase("unlimited")) {
				try {
					writeText("customers.txt", name.trim() + "," + address.trim() + "," + plan.trim().toLowerCase()
							+ "," + id + "," + mobile, true);
					writeText("customersLeftLimited.txt", name.trim() + "," + address.trim() + ","
							+ plan.trim().toLowerCase() + "," + id + "," + mobile, true);

				} catch (IOException e1) {

				}
				m.addCustomer(name, address, plan, id, mobile, null);

			} else if (plan.trim().equalsIgnoreCase("limited")) {
				if (!limited.equalsIgnoreCase(" ")) {
					try {
						writeText("customers.txt", name.trim() + "," + address.trim() + "," + plan.trim().toLowerCase()
								+ "," + id + "," + mobile + "," + Integer.parseInt(limited.trim()), true);
						writeText("customersLeftLimited.txt",
								name.trim() + "," + address.trim() + "," + plan.trim().toLowerCase() + "," + id + ","
										+ mobile + "," + Integer.parseInt(limited.trim()),
								true);
					} catch (NumberFormatException | IOException e1) {

					}
					m.addCustomer(name, address, plan, id, mobile, limited);
				} else if (limited.equalsIgnoreCase("")) {
					try {

						writeText("customers.txt", name.trim() + "," + address.trim() + "," + plan.trim().toLowerCase()
								+ "," + id + "," + mobile + "," + "2", true);
						writeText("customersLeftLimited.txt", name.trim() + "," + address.trim() + ","
								+ plan.trim().toLowerCase() + "," + id + "," + mobile + "," + "2", true);
					} catch (NumberFormatException | IOException e1) {

					}
					m.addCustomer(name, address, plan, id, mobile, "2");
				}

			}

		}

	}

	public static void testAddingCustomer(String name, String address, String plan, String ID, String mobileNumber,
			String limited) throws IOException { // this limited used to give the limited if it was limited (the plan)
		int d = -404; // checker
		for (int i = 0; i < m.customers.size(); i++) {
			if (m.customers.get(i).getID().equalsIgnoreCase(ID.trim()))
				d = i;
		}
		if (d == -404) {
			if (plan.equalsIgnoreCase("unlimited") && limited == null) {
				writeText("customers.txt", name.trim() + "," + address.trim() + "," + plan.trim().toLowerCase() + ","
						+ ID + "," + mobileNumber, true);
				m.addCustomer(name, address, plan, ID, mobileNumber, null);
			} else if (plan.equalsIgnoreCase("limited")) {
				if (limited != null) {
					writeText("customers.txt", name.trim() + "," + address.trim() + "," + plan.trim().toLowerCase()
							+ "," + ID + "," + mobileNumber + "," + Integer.parseInt(limited.trim()), true);
					m.addCustomer(name, address, plan, ID, mobileNumber, limited);
				}
			}
		}
	}

	public static void testAddingMedia(String type, String title, int copiesAvailable, String code, String rating,
			String artist, String songs, double weight) throws IOException {
		int d = -404; // checker
		for (int i = 0; i < m.media.size(); i++) {
			if (m.media.get(i).getCode().equalsIgnoreCase(code.trim()))
				d = i;
		}
		if (d == -404) {
			if (type.trim().equalsIgnoreCase("Movie")) {
				m.addMovie(title, copiesAvailable, code, rating);
				writeText("media.txt",
						"Movie ," + title.trim() + " , " + copiesAvailable + "," + code + " , " + rating.trim(), true);

			} else if (type.trim().equalsIgnoreCase("Album")) {
				m.addAlbum(title, copiesAvailable, code, artist, songs);
				writeText("media.txt", "Album ," + title.trim() + " , " + copiesAvailable + "," + code + " , "
						+ artist.trim() + " , " + songs, true);
			} else if (type.trim().equalsIgnoreCase("Game")) {
				writeText("media.txt", "Game ," + title.trim() + " , " + copiesAvailable + "," + code + " , " + weight,
						true);
				m.addGame(title, copiesAvailable, code, weight);
			}
		}
	}

	public static void testingAddingToCart(String customerId, String mediaCode) {
		m.addToCart(customerId, mediaCode);

	}

	public static void testingRemovingFromCart(String customerId, String mediaCode) {
		m.removeFromCart(customerId, mediaCode);
	}

	public static void testProcessingRequestsOne() {
		m.processRequests();

	}

	// public static void testProcessingRequestsTwo(){}
	// i have used only one processing method in rental manager
	public static void testReturnMedia(String customerId, String mediaCode) {
		m.returnMedia(customerId, mediaCode);

	}

	public static void testSearchMedia(String title, String rating, String artist, String songs, String mediaCode) {
		m.searchMedia(title, rating, artist, songs, mediaCode);

	}

}
