import java.awt.*;
import java.awt.event.*;

public class pro1 extends Frame implements ActionListener, ItemListener {
    Label lblRegPlate, lblCategory, lblModel, lblRate, lblHours, lblIDProof, lblCustomerName, lblTotalCost, lblAvailability;
    TextField txtRegPlate, txtRate, txtHours, txtCustomerName, txtTotalCost;
    Choice choiceCategory, choiceModel, choiceIDProof;
    CheckboxGroup cbgAvailability;
    Checkbox cbAvailable, cbNotAvailable;
    Button btnCalculate, btnReset;

    public pro1() {
        setLayout(new GridLayout(13, 2));

        lblRegPlate = new Label("Vehicle Registration Plate:");
        txtRegPlate = new TextField();
        add(lblRegPlate);
        add(txtRegPlate);

        lblCategory = new Label("Vehicle Category:");
        choiceCategory = new Choice();
        choiceCategory.add("Sedan");
        choiceCategory.add("SUV");
        choiceCategory.add("Truck");
        choiceCategory.add("Hatchback");
        choiceCategory.add("Convertible");
        choiceCategory.add("Coupe");
        choiceCategory.add("Minivan");
        choiceCategory.addItemListener(this);
        add(lblCategory);
        add(choiceCategory);

        lblModel = new Label("Vehicle Model:");
        choiceModel = new Choice();
        choiceModel.add("Model A");
        choiceModel.add("Model B");
        choiceModel.add("Model C");
        choiceModel.add("Model D");
        choiceModel.add("Model E");
        choiceModel.add("Model F");
        choiceModel.add("Model G");
        choiceModel.addItemListener(this);
        add(lblModel);
        add(choiceModel);

        lblRate = new Label("Per Hour Rate:");
        txtRate = new TextField();
        txtRate.setEditable(false);
        add(lblRate);
        add(txtRate);

        lblHours = new Label("No of Hours Rented:");
        txtHours = new TextField();
        add(lblHours);
        add(txtHours);

        lblIDProof = new Label("ID Proof Submitted:");
        choiceIDProof = new Choice();
        choiceIDProof.add("Aadhar");
        choiceIDProof.add("Driver's License");
        choiceIDProof.add("PAN Card");
        choiceIDProof.add("Passport");
        add(lblIDProof);
        add(choiceIDProof);

        lblCustomerName = new Label("Customer Name:");
        txtCustomerName = new TextField();
        add(lblCustomerName);
        add(txtCustomerName);

        lblAvailability = new Label("Availability:");
        cbgAvailability = new CheckboxGroup();
        cbAvailable = new Checkbox("Available", cbgAvailability, true);
        cbNotAvailable = new Checkbox("Not Available", cbgAvailability, false);
        add(lblAvailability);
        add(cbAvailable);
        add(new Label(""));
        add(cbNotAvailable);

        lblTotalCost = new Label("Total Cost:");
        txtTotalCost = new TextField();
        txtTotalCost.setEditable(false);
        add(lblTotalCost);
        add(txtTotalCost);

        btnCalculate = new Button("Calculate Total Cost");
        btnCalculate.addActionListener(this);
        add(btnCalculate);

        btnReset = new Button("Reset");
        btnReset.addActionListener(this);
        add(btnReset);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setTitle("Vehicle Rental System");
        setSize(500, 600);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == choiceCategory || e.getSource() == choiceModel) {
            String category = choiceCategory.getSelectedItem();
            String model = choiceModel.getSelectedItem();
            double rate = 0.0;
            if (category.equals("Sedan")) {
                if (model.equals("Model A")) rate = 10.0;
                else if (model.equals("Model B")) rate = 12.0;
                else if (model.equals("Model C")) rate = 15.0;
                else if (model.equals("Model D")) rate = 20.0;
                else if (model.equals("Model E")) rate = 25.0;
                else if (model.equals("Model F")) rate = 28.0;
                else if (model.equals("Model G")) rate = 35.0;
            } else if (category.equals("SUV")) {
                if (model.equals("Model A")) rate = 20.0;
                else if (model.equals("Model B")) rate = 32.0;
                else if (model.equals("Model C")) rate = 35.0;
                else if (model.equals("Model D")) rate = 40.0;
                else if (model.equals("Model E")) rate = 45.0;
                else if (model.equals("Model F")) rate = 48.0;
                else if (model.equals("Model G")) rate = 55.0;
            } else if (category.equals("Truck")) {
                if (model.equals("Model A")) rate = 30.0;
                else if (model.equals("Model B")) rate = 32.0;
                else if (model.equals("Model C")) rate = 35.0;
                else if (model.equals("Model D")) rate = 40.0;
                else if (model.equals("Model E")) rate = 45.0;
                else if (model.equals("Model F")) rate = 48.0;
                else if (model.equals("Model G")) rate = 53.0;
            } else if (category.equals("Hatchback")) {
            	if (model.equals("Model A")) rate = 20.0;
                else if (model.equals("Model B")) rate = 22.0;
                else if (model.equals("Model C")) rate = 25.0;
                else if (model.equals("Model D")) rate = 28.0;
                else if (model.equals("Model E")) rate = 35.0;
                else if (model.equals("Model F")) rate = 38.0;
                else if (model.equals("Model G")) rate = 43.0;
            } else if (category.equals("Convertible")) {
            	if (model.equals("Model A")) rate = 15.0;
                else if (model.equals("Model B")) rate = 22.0;
                else if (model.equals("Model C")) rate = 28.0;
                else if (model.equals("Model D")) rate = 30.0;
                else if (model.equals("Model E")) rate = 35.0;
                else if (model.equals("Model F")) rate = 33.0;
                else if (model.equals("Model G")) rate = 41.0;
            } else if (category.equals("Coupe")) {
            	if (model.equals("Model A")) rate = 22.0;
                else if (model.equals("Model B")) rate = 25.0;
                else if (model.equals("Model C")) rate = 30.0;
                else if (model.equals("Model D")) rate = 35.0;
                else if (model.equals("Model E")) rate = 37.0;
                else if (model.equals("Model F")) rate = 39.0;
                else if (model.equals("Model G")) rate = 42.0;
            } else if (category.equals("Minivan")) {
            	if (model.equals("Model A")) rate = 21.0;
                else if (model.equals("Model B")) rate = 23.0;
                else if (model.equals("Model C")) rate = 25.0;
                else if (model.equals("Model D")) rate = 28.0;
                else if (model.equals("Model E")) rate = 33.0;
                else if (model.equals("Model F")) rate = 45.0;
                else if (model.equals("Model G")) rate = 49.0;
            }
            txtRate.setText(String.valueOf(rate));
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalculate) {
            if (cbgAvailability.getSelectedCheckbox() == cbNotAvailable) {
                txtTotalCost.setText("Vehicle not available");
            } else {
                double rate = Double.parseDouble(txtRate.getText());
                int hours = Integer.parseInt(txtHours.getText());
                double totalCost = rate * hours;
                txtTotalCost.setText(String.valueOf(totalCost));
            }
        } else if (e.getSource() == btnReset) {
            txtRegPlate.setText("");
            choiceCategory.select(0);
            choiceModel.select(0);
            txtRate.setText("");
            txtHours.setText("");
            choiceIDProof.select(0);
            txtCustomerName.setText("");
            cbgAvailability.setSelectedCheckbox(cbAvailable);
            txtTotalCost.setText("");
        }
    }

    public static void main(String[] args) {
        new VehicleRentalSystem();
    }
}
