/**
 * This class is the main class of the program.
 * It is used to create User interface for the transport
 * @author(Aakash_Acharya)
 * @date(8/5/2022)
 * @version(1.0.0)
 */
package transportpackage;

//Import the necessary Javax swing components
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.JTableHeader;

//Import the necessary java awt packages
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

//Import the necessary Action Listener packages
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

//Import the necessary arrayList package
import java.util.ArrayList;

public class TransportGUI {

    // Final variables that are used to set properties of different components
    public static final Color sidebarBG = new Color(0x4b4a67);
    public static final Color mainContentBG = new Color(162, 218, 241);
    public static final Color textFieldBorderColor = new Color(0x000000);
    public static final Border textFieldBorder = BorderFactory.createMatteBorder(0, 0, 4, 0, textFieldBorderColor);
    public static final Border buttonBorder = BorderFactory.createLineBorder(mainContentBG, 4);
    public static final Font smallFont = new Font("Serif", Font.PLAIN, 30);
    public static final Font bigFont = new Font("Serif", Font.PLAIN, 60);
    public static final Font tableFont = new Font("Serif", Font.PLAIN, 25);
    public static final Insets insets = new Insets(10, 10, 10, 10);

    //Declaring JTextFields with private access modifier

    private JTextField vehicleIDField;
    private JTextField vehicleNameField;
    private JTextField vehicleWeightField;
    private JTextField vehicleColorField;
    private JTextField vehicleSpeedField;
    private JTextField engineDisplacementField;
    private JTextField torqueField;
    private JTextField fuelTankCapacityField;
    private JTextField groundClearanceField;
    private JTextField vehicleBatteryCapacityField;
    private JTextField chargeAmountField;
    private JTextField numberOfSeatsField;
    private JTextField vehicleBrandField;
    private JTextField vehiclePriceField;
    private JTextField vehicleMileageField;
    private JTextField vehicleRangeField;
    private JTextField vehicleChargingTimeField;

    //End of declaration of JTextFields

    private final ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();     //Creating arraylist of vehicles to store the vehicles

    //Creating object of AutoRickshaw and ElectricScooter class
    AutoRickshaw autoRickshaw;
    ElectricScooter electricScooter;

    //Start of getter method for JTextFields with corresponding return types
    public Integer getVehicleIDField() {
        try {
            return Integer.parseInt(vehicleIDField.getText());
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public String getVehicleNameField() {
        return vehicleNameField.getText();
    }

    public String getVehicleWeightField() {
        return vehicleWeightField.getText();
    }

    public String getVehicleColorField() {
        return vehicleColorField.getText();
    }

    public String getVehicleSpeedField() {
        return vehicleSpeedField.getText();
    }

    public Integer getEngineDisplacementField() {
        try {
            return Integer.parseInt(engineDisplacementField.getText());
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public String getTorqueField() {
        return torqueField.getText();
    }

    public Integer getFuelTankCapacityField() {
        try {
            return Integer.parseInt(fuelTankCapacityField.getText());
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public String getGroundClearanceField() {
        return groundClearanceField.getText();
    }

    public Integer getVehicleBatteryCapacityField() {
        try {
            return Integer.parseInt(vehicleBatteryCapacityField.getText());
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public Integer getChargeAmountField() {
        try {
            return Integer.parseInt(chargeAmountField.getText());
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public Integer getNumberOfSeatsField() {
        try {
            return Integer.parseInt(numberOfSeatsField.getText());
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public String getVehicleBrandField() {
        return vehicleBrandField.getText();
    }

    public Integer getVehiclePriceField() {
        try {
            return Integer.parseInt(vehiclePriceField.getText());
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public String getChargingTimeField() {
        return vehicleChargingTimeField.getText();
    }

    public String getVehicleMileageField() {
        return vehicleMileageField.getText();
    }

    public Integer getVehicleRangeField() {
        try {
            return Integer.parseInt(vehicleRangeField.getText());
        } catch (NumberFormatException e) {
            return null;
        }
    }

    // End of getter method for JTextFields with corresponding return types

    /*
        The constructor TransportGUI is a no arguments constructor that initializes GridBagConstraints and basic codes for the user interface components such as a JFrame i.e., frame, JPanel sidebar, and
        JPanel content panels that further hold other components of the interface such as JLables and JButtons and their action listeners. Since this is the basic interface, it calls other JPanel return
        type methods according to user choice and button clicks.
    */
    public TransportGUI() {
        GridBagConstraints gbc = new GridBagConstraints();
        GridBagConstraints sidebarGbc = new GridBagConstraints();
        GridBagConstraints contentGbc = new GridBagConstraints();

        JFrame frame = new JFrame("Transport GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1300, 900);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        // Sidebar panel starts here

        JPanel sidebar = new JPanel();
        sidebar.setBackground(sidebarBG);
        sidebar.setLayout(new GridBagLayout());
        sidebar.setSize(300, 900);

        // Sidebar contents starts here

        JPanel sidebarTitlePanel = new JPanel();
        sidebarTitlePanel.setBackground(sidebarBG);
        JLabel sidebarTitle = new JLabel("TransportGUI");
        sidebarTitle.setFont(smallFont);
        sidebarTitle.setForeground(Color.WHITE);
        sidebarTitlePanel.add(sidebarTitle);
        sidebarGbc.gridx = 0;
        sidebarGbc.gridy = 0;
        sidebarGbc.insets = new Insets(0, 0, 200, 0);
        sidebar.add(sidebarTitlePanel, sidebarGbc);

        JPanel sidebarButtonPanel = new JPanel();
        sidebarButtonPanel.setBackground(sidebarBG);
        sidebarButtonPanel.setLayout(new GridBagLayout());
        sidebarButtonPanel.setSize(300, 700);

        gbc.gridwidth = 1;
        gbc.insets = new Insets(10, 0, 10, 0);
        gbc.fill = GridBagConstraints.BOTH;

        JButton arAddButton = new JButton("Auto Rickshaw");
        arAddButton.setFont(smallFont);
        arAddButton.setBackground(mainContentBG);
        arAddButton.setFocusable(false);
        gbc.gridy = 0;
        sidebarButtonPanel.add(arAddButton, gbc);

        JButton esAddButton = new JButton("Electric Scooter");
        esAddButton.setFont(smallFont);
        esAddButton.setBackground(mainContentBG);
        esAddButton.setFocusable(false);
        gbc.gridy = 1;
        sidebarButtonPanel.add(esAddButton, gbc);

        JButton arBookButton = new JButton("Book");
        arBookButton.setFont(smallFont);
        arBookButton.setBackground(mainContentBG);
        arBookButton.setFocusable(false);
        gbc.gridy = 2;
        sidebarButtonPanel.add(arBookButton, gbc);

        JButton esPurchaseButton = new JButton("Purchase");
        esPurchaseButton.setFont(smallFont);
        esPurchaseButton.setBackground(mainContentBG);
        esPurchaseButton.setFocusable(false);
        gbc.gridy = 3;
        sidebarButtonPanel.add(esPurchaseButton, gbc);

        JButton esSellButton = new JButton("Sell");
        esSellButton.setFont(smallFont);
        esSellButton.setBackground(mainContentBG);
        esSellButton.setFocusable(false);
        gbc.gridy = 4;
        sidebarButtonPanel.add(esSellButton, gbc);

        JButton displayButton = new JButton("Display");
        displayButton.setFont(smallFont);
        displayButton.setBackground(mainContentBG);
        displayButton.setFocusable(false);
        gbc.gridy = 5;
        sidebarButtonPanel.add(displayButton, gbc);
        sidebarGbc.gridx = 0;
        sidebarGbc.gridy = 1;
        sidebar.add(sidebarButtonPanel, sidebarGbc);

        // Sidebar contents ends here

        frame.add(sidebar);
        // Sidebar panel ends here

        JPanel content = new JPanel();
        content.setBackground(mainContentBG);
        content.setLayout(new GridBagLayout());
        content.setBounds(300, 0, 1000, 900);

        JPanel mainContentTitlePanel = new JPanel();
        mainContentTitlePanel.setBackground(mainContentBG);
        JLabel mainContentTitle = new JLabel("WELCOME");
        mainContentTitle.setFont(bigFont);
        contentGbc.gridx = 0;
        contentGbc.gridy = 0;
        mainContentTitlePanel.add(mainContentTitle);
        content.add(mainContentTitlePanel, contentGbc);

        JPanel mainContentPanel = new JPanel();
        mainContentPanel.setLayout(new GridBagLayout());
        contentGbc.gridy = 1;
        content.add(mainContentPanel, contentGbc);

        frame.add(content);

        frame.setVisible(true);

        /*
            The following code is for the action listeners for the buttons.
            Each button has a corresponding action listener that calls a method that returns a JPanel with the corresponding components.
        */
        arAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainContentPanel.removeAll();
                mainContentTitle.setText("Add - Auto Rickshaw");
                mainContentPanel.add(addArPanel());
                mainContentPanel.revalidate();
                mainContentPanel.repaint();
            }
        });

        esAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainContentPanel.removeAll();
                mainContentTitle.setText("Add - Electric Scooter");
                mainContentPanel.add(addEsPanel());
                mainContentPanel.revalidate();
                mainContentPanel.repaint();
            }
        });

        arBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainContentPanel.removeAll();
                mainContentTitle.setText("Book - Auto Rickshaw");
                mainContentPanel.add(bookArPanel());
                mainContentPanel.revalidate();
                mainContentPanel.repaint();
            }
        });

        esPurchaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainContentPanel.removeAll();
                mainContentTitle.setText("Purchase - Electric Scooter");
                mainContentPanel.add(purchaseEsPanel());
                mainContentPanel.revalidate();
                mainContentPanel.repaint();
            }
        });

        esSellButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainContentPanel.removeAll();
                mainContentTitle.setText("Sell - Electric Scooter");
                mainContentPanel.add(sellEsPanel());
                mainContentPanel.revalidate();
                mainContentPanel.repaint();
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (vehicles.size() == 0) {
                    JOptionPane.showMessageDialog(null, "No vehicles to display");
                } else {
                    displayFrame();
                }
            }
        });

    }

    /*
       This method has common JLables and JTextFields necessary to perform the addition of both autorickshaw and electric scooter to the arraylist such as vehicle id,
       vehicle name, vehicle color, vehicle speed, and vehicle weight. This method helps to minimize the code for the present JTextFields and call whenever needed.
    */
    public void defaultInputOperations(GridBagConstraints gbc, JPanel panel) {
        JLabel vehicleIDLabel = new JLabel("Vehicle ID");
        vehicleIDLabel.setFont(smallFont);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = insets;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(vehicleIDLabel, gbc);

        vehicleIDField = new JTextField(10);
        vehicleIDField.setFont(smallFont);

        vehicleIDField.setForeground(Color.GRAY);
        vehicleIDField.setText("");

        vehicleIDField.setBorder(textFieldBorder);
        gbc.gridx = 1;
        panel.add(vehicleIDField, gbc);

        JLabel vehicleNameLabel = new JLabel("Vehicle Name");
        vehicleNameLabel.setFont(smallFont);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(vehicleNameLabel, gbc);

        vehicleNameField = new JTextField(10);
        vehicleNameField.setFont(smallFont);

        vehicleNameField.setForeground(Color.GRAY);
        vehicleNameField.setText("");

        vehicleNameField.setBorder(textFieldBorder);
        gbc.gridx = 1;
        panel.add(vehicleNameField, gbc);

        JLabel vehicleWeightLabel = new JLabel("Vehicle Weight");
        vehicleWeightLabel.setFont(smallFont);
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(vehicleWeightLabel, gbc);

        vehicleWeightField = new JTextField(10);
        vehicleWeightField.setFont(smallFont);

        vehicleWeightField.setForeground(Color.GRAY);
        vehicleWeightField.setText("");

        vehicleWeightField.setBorder(textFieldBorder);
        gbc.gridx = 1;
        panel.add(vehicleWeightField, gbc);

        JLabel vehicleColorLabel = new JLabel("Vehicle Color");
        vehicleColorLabel.setFont(smallFont);
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(vehicleColorLabel, gbc);

        vehicleColorField = new JTextField(10);
        vehicleColorField.setFont(smallFont);

        vehicleColorField.setForeground(Color.GRAY);
        vehicleColorField.setText("");

        vehicleColorField.setBorder(textFieldBorder);
        gbc.gridx = 1;
        panel.add(vehicleColorField, gbc);

        JLabel vehicleSpeedLabel = new JLabel("Vehicle Speed");
        vehicleSpeedLabel.setFont(smallFont);
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(vehicleSpeedLabel, gbc);

        vehicleSpeedField = new JTextField(10);
        vehicleSpeedField.setFont(smallFont);

        vehicleSpeedField.setForeground(Color.GRAY);
        vehicleSpeedField.setText("");

        vehicleSpeedField.setBorder(textFieldBorder);
        gbc.gridx = 1;
        panel.add(vehicleSpeedField, gbc);

    }

    /*
        These methods return addArPanel and addEsPanel which is called upon button click of corresponding buttons on sidebar panel and added to mainContentPanel panel in the content panel.
        The returned panel calls defaultInputOpeations() method that has necessary basic JTextFields and JLables and also other additional JLabels and JTextAreas required for the operations.
        After entering values, the method calls action listener on clicking addButton that performs validation of information entered on text fields and proceeds to the creation of an object of
        respective class by passing the values from text field and later adding that object to the vehicles array list but if the information is wrong the user is notified accordingly.
        Additionally, exceptions are also caught such as NumberFormatException.
    */
    public JPanel addArPanel() {
        GridBagConstraints gbc = new GridBagConstraints();
        JPanel arPanel = new JPanel();
        arPanel.setBackground(mainContentBG);
        arPanel.setLayout(new GridBagLayout());

        defaultInputOperations(gbc, arPanel);

        JLabel engineDisplacementLabel = new JLabel("Engine Displacement");
        engineDisplacementLabel.setFont(smallFont);
        gbc.gridx = 0;
        gbc.gridy = 5;
        arPanel.add(engineDisplacementLabel, gbc);

        engineDisplacementField = new JTextField(10);
        engineDisplacementField.setFont(smallFont);

        engineDisplacementField.setForeground(Color.GRAY);
        engineDisplacementField.setText("");

        engineDisplacementField.setBorder(textFieldBorder);
        gbc.gridx = 1;
        arPanel.add(engineDisplacementField, gbc);

        JLabel torqueLabel = new JLabel("Torque");
        torqueLabel.setFont(smallFont);
        gbc.gridx = 0;
        gbc.gridy = 6;
        arPanel.add(torqueLabel, gbc);

        torqueField = new JTextField(10);
        torqueField.setFont(smallFont);

        torqueField.setForeground(Color.GRAY);
        torqueField.setText("");

        torqueField.setBorder(textFieldBorder);
        gbc.gridx = 1;
        arPanel.add(torqueField, gbc);

        JLabel fuelTankCapacityLabel = new JLabel("Fuel Tank Capacity");
        fuelTankCapacityLabel.setFont(smallFont);
        gbc.gridx = 0;
        gbc.gridy = 7;
        arPanel.add(fuelTankCapacityLabel, gbc);

        fuelTankCapacityField = new JTextField(10);
        fuelTankCapacityField.setFont(smallFont);

        fuelTankCapacityField.setForeground(Color.GRAY);
        fuelTankCapacityField.setText("");

        fuelTankCapacityField.setBorder(textFieldBorder);
        gbc.gridx = 1;
        arPanel.add(fuelTankCapacityField, gbc);

        JLabel groundClearanceLabel = new JLabel("Ground Clearance");
        groundClearanceLabel.setFont(smallFont);
        gbc.gridx = 0;
        gbc.gridy = 8;
        arPanel.add(groundClearanceLabel, gbc);

        groundClearanceField = new JTextField(10);
        groundClearanceField.setFont(smallFont);

        groundClearanceField.setForeground(Color.GRAY);
        groundClearanceField.setText("");

        groundClearanceField.setBorder(textFieldBorder);
        gbc.gridx = 1;
        arPanel.add(groundClearanceField, gbc);

        JButton addButton = new JButton("Add");
        addButton.setFont(smallFont);
        addButton.setBackground(sidebarBG);
        addButton.setForeground(Color.WHITE);
        addButton.setBorder(buttonBorder);
        addButton.setFocusable(false);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 9;
        arPanel.add(addButton, gbc);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int vehicleId = Integer.parseInt(vehicleIDField.getText());
                    int engineDisplacement = Integer.parseInt(engineDisplacementField.getText());
                    int fuelTankCapacity = Integer.parseInt(fuelTankCapacityField.getText());

                    String vehicleName = vehicleNameField.getText();
                    String vehicleColor = vehicleColorField.getText();
                    String vehicleWeight = vehicleWeightField.getText();
                    String vehicleSpeed = vehicleSpeedField.getText();
                    String torque = torqueField.getText();
                    String groundClearance = groundClearanceField.getText();

                    if (getAutoRickshawById(vehicleId) != null) {
                        JOptionPane.showMessageDialog(null, "Auto rickshaw with that ID already exists!");
                        return;
                    }
                    if (vehicleName.isBlank() || vehicleColor.isBlank() || vehicleWeight.isBlank() || vehicleSpeed.isBlank() || torque.isBlank() || groundClearance.isBlank()) {
                        JOptionPane.showMessageDialog(null, "Please fill all the fields! ");
                    } else {
                        AutoRickshaw autoRickshaw = new AutoRickshaw(vehicleId, vehicleName, vehicleWeight, vehicleColor, vehicleSpeed, engineDisplacement, torque, fuelTankCapacity, groundClearance);
                        vehicles.add(autoRickshaw);
                        JOptionPane.showMessageDialog(null, "Auto rickshaw added successfully");
                        vehicleIDField.setText("");
                        vehicleNameField.setText("");
                        vehicleWeightField.setText("");
                        vehicleColorField.setText("");
                        vehicleSpeedField.setText("");
                        engineDisplacementField.setText("");
                        torqueField.setText("");
                        fuelTankCapacityField.setText("");
                        groundClearanceField.setText("");
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vehicle ID,\nEngine Displacement, and\nFuel Tank Capacity must be integers\nand cannot be blank");
                }
            }
        });

        JButton clearButton = new JButton("Clear");
        clearButton.setFont(smallFont);
        clearButton.setBackground(sidebarBG);
        clearButton.setForeground(Color.WHITE);
        clearButton.setBorder(buttonBorder);
        clearButton.setFocusable(false);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 9;
        arPanel.add(clearButton, gbc);

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vehicleIDField.setText("");
                vehicleNameField.setText("");
                vehicleWeightField.setText("");
                vehicleColorField.setText("");
                vehicleSpeedField.setText("");
                engineDisplacementField.setText("");
                torqueField.setText("");
                fuelTankCapacityField.setText("");
                groundClearanceField.setText("");
            }
        });
        return arPanel;
    }

    public JPanel addEsPanel() {
        GridBagConstraints gbc = new GridBagConstraints();
        JPanel esPanel = new JPanel();
        esPanel.setBackground(mainContentBG);

        esPanel.setLayout(new GridBagLayout());

        defaultInputOperations(gbc, esPanel);

        JLabel vehicleBatteryCapacityLabel = new JLabel("Vehicle Battery Capacity");
        vehicleBatteryCapacityLabel.setFont(smallFont);
        gbc.gridx = 0;
        gbc.gridy = 5;
        esPanel.add(vehicleBatteryCapacityLabel, gbc);

        vehicleBatteryCapacityField = new JTextField(10);
        vehicleBatteryCapacityField.setFont(smallFont);

        vehicleBatteryCapacityField.setForeground(Color.GRAY);
        vehicleBatteryCapacityField.setText("");

        vehicleBatteryCapacityField.setBorder(textFieldBorder);
        gbc.gridx = 1;
        esPanel.add(vehicleBatteryCapacityField, gbc);

        JButton addButton = new JButton("Add");
        addButton.setFont(smallFont);
        addButton.setBackground(sidebarBG);
        addButton.setForeground(Color.WHITE);
        addButton.setBorder(buttonBorder);
        addButton.setFocusable(false);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 6;
        esPanel.add(addButton, gbc);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    int vehicleId = Integer.parseInt(vehicleIDField.getText());
                    int batteryCapacity = Integer.parseInt(vehicleBatteryCapacityField.getText());

                    String vehicleName = vehicleNameField.getText();
                    String vehicleColor = vehicleColorField.getText();
                    String vehicleWeight = vehicleWeightField.getText();
                    String vehicleSpeed = vehicleSpeedField.getText();

                    if (getElectricScooterById(vehicleId) != null) {
                        JOptionPane.showMessageDialog(null, "Electric scooter with that ID already exists!");
                        return;
                    }
                    if (vehicleName.isBlank() || vehicleColor.isBlank() || vehicleWeight.isBlank() || vehicleSpeed.isBlank()) {
                        JOptionPane.showMessageDialog(null, "Please fill all the fields! ");
                    } else {
                        ElectricScooter electricScooter = new ElectricScooter(vehicleId, vehicleName, vehicleWeight, vehicleSpeed, vehicleColor, batteryCapacity);
                        vehicles.add(electricScooter);
                        JOptionPane.showMessageDialog(null, "Electric scooter added successfully");
                        vehicleIDField.setText("");
                        vehicleNameField.setText("");
                        vehicleWeightField.setText("");
                        vehicleColorField.setText("");
                        vehicleSpeedField.setText("");
                        vehicleBatteryCapacityField.setText("");
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vehicle ID and Battery Capacity must be integers!");
                }
            }
        });


        JButton clearButton = new JButton("Clear");
        clearButton.setFont(smallFont);
        clearButton.setBackground(sidebarBG);
        clearButton.setForeground(Color.WHITE);
        clearButton.setBorder(buttonBorder);
        clearButton.setFocusable(false);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 6;
        esPanel.add(clearButton, gbc);

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vehicleIDField.setText("");
                vehicleNameField.setText("");
                vehicleWeightField.setText("");
                vehicleColorField.setText("");
                vehicleSpeedField.setText("");
                vehicleBatteryCapacityField.setText("");
            }
        });
        return esPanel;
    }

    /*
        this method returns JPanel i.e., bookArPanel which is called upon button click of arBookButton on sidebar panel and added to mainContentPanel panel in the content panel. The returned panel
        has necessary text field that are necessary to input data for booking an auto rickshaw such as id, charge amount, etc. Also, JComboBox is used to select date of booking. After entering values,
        the method calls action listener on clicking bookButton that performs validation of information entered on text fields and proceeds to the booking by passing the values from text field to
        the booking method of auto rickshaw class but if the information is wrong the user is notified accordingly. Additionally, exceptions are also caught such as NumberFormatException.
    */

    public JPanel bookArPanel() {
        GridBagConstraints gbc = new GridBagConstraints();
        JPanel bookArPanel = new JPanel();
        bookArPanel.setBackground(mainContentBG);
        bookArPanel.setLayout(new GridBagLayout());

        JLabel vehicleIDLabel = new JLabel("Vehicle ID");
        vehicleIDLabel.setFont(smallFont);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = insets;
        gbc.gridx = 0;
        gbc.gridy = 0;
        bookArPanel.add(vehicleIDLabel, gbc);

        vehicleIDField = new JTextField(10);
        vehicleIDField.setFont(smallFont);

        vehicleIDField.setForeground(Color.GRAY);
        vehicleIDField.setText("");


        vehicleIDField.setBorder(textFieldBorder);
        vehicleIDField.setBorder(textFieldBorder);
        gbc.gridx = 1;
        bookArPanel.add(vehicleIDField, gbc);

        vehicleIDField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                try {
                    AutoRickshaw autoRickshaw = getAutoRickshawById(Integer.parseInt(vehicleIDField.getText()));
                    if (autoRickshaw != null) {
                        JOptionPane.showMessageDialog(null, "Vehicle Name: " + autoRickshaw.getVehicleName() + "\n" + "Vehicle Color: " + autoRickshaw.getVehicleColor() + "\n" + "Vehicle Weight: " + autoRickshaw.getVehicleWeight() + "\n" + "Vehicle Speed: " + autoRickshaw.getVehicleSpeed());
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vehicle ID must be an integer!");
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });


        JLabel bookingDateLabel = new JLabel("Booking Date");
        bookingDateLabel.setFont(smallFont);
        gbc.gridx = 0;
        gbc.gridy = 1;
        bookArPanel.add(bookingDateLabel, gbc);

        JPanel bookingDatePanel = new JPanel();
        bookingDatePanel.setLayout(new GridBagLayout());
        bookingDatePanel.setBackground(mainContentBG);
        GridBagConstraints gbc2 = new GridBagConstraints();

        Object[] date = new Object[32];
        date[0] = "Date";
        for (int i = 1; i < 32; i++) {
            date[i] = i;
        }
        JComboBox bookingDateComboBox = new JComboBox(date);
        bookingDateComboBox.setFont(smallFont);
        bookingDateComboBox.setBorder(textFieldBorder);
        gbc2.gridx = 1;
        gbc2.insets = new Insets(10, 0, 10, 10);
        bookingDatePanel.add(bookingDateComboBox, gbc2);


        Object[] month = new Object[13];
        month[0] = "Month";
        for (int i = 1; i < 13; i++) {
            month[i] = i;
        }
        JComboBox bookingMonthComboBox = new JComboBox(month);
        bookingMonthComboBox.setFont(smallFont);
        bookingMonthComboBox.setBorder(textFieldBorder);
        gbc2.gridx = 2;
        bookingDatePanel.add(bookingMonthComboBox, gbc2);


        Object[] year = new Object[20];
        year[0] = "Year";
        for (int i = 1; i < 20; i++) {
            year[i] = 2022 + i;
        }
        JComboBox bookingYearComboBox = new JComboBox(year);
        bookingYearComboBox.setFont(smallFont);
        bookingYearComboBox.setBorder(textFieldBorder);
        gbc2.gridx = 3;
        bookingDatePanel.add(bookingYearComboBox, gbc2);
        gbc.gridx = 1;
        gbc.gridy = 1;
        bookArPanel.add(bookingDatePanel, gbc);

        JLabel chargeAmountLabel = new JLabel("Charge Amount");
        chargeAmountLabel.setFont(smallFont);
        gbc.gridx = 0;
        gbc.gridy = 2;
        bookArPanel.add(chargeAmountLabel, gbc);

        chargeAmountField = new JTextField(10);
        chargeAmountField.setFont(smallFont);

        chargeAmountField.setForeground(Color.GRAY);
        chargeAmountField.setText("");

        chargeAmountField.setBorder(textFieldBorder);
        gbc.gridx = 1;
        bookArPanel.add(chargeAmountField, gbc);

        JLabel numberOfSeatsLabel = new JLabel("Number of Seats");
        numberOfSeatsLabel.setFont(smallFont);
        gbc.gridx = 0;
        gbc.gridy = 3;
        bookArPanel.add(numberOfSeatsLabel, gbc);

        numberOfSeatsField = new JTextField(10);
        numberOfSeatsField.setFont(smallFont);

        numberOfSeatsField.setForeground(Color.GRAY);
        numberOfSeatsField.setText("");

        numberOfSeatsField.setBorder(textFieldBorder);
        gbc.gridx = 1;
        bookArPanel.add(numberOfSeatsField, gbc);

        JButton bookButton = new JButton("Book Now!");
        bookButton.setFont(smallFont);
        bookButton.setBackground(sidebarBG);
        bookButton.setForeground(Color.WHITE);
        bookButton.setBorder(buttonBorder);
        bookButton.setFocusable(false);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 9;
        bookArPanel.add(bookButton, gbc);

        bookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int vehicleId = Integer.parseInt(vehicleIDField.getText());
                    int chargeAmount = Integer.parseInt(chargeAmountField.getText());
                    int numberOfSeats = Integer.parseInt(numberOfSeatsField.getText());
                    String bookingDate = bookingDateComboBox.getSelectedItem().toString() + "/" + bookingMonthComboBox.getSelectedItem().toString() + "/" + bookingYearComboBox.getSelectedItem().toString();
                    if (bookingDateComboBox.getSelectedIndex() == 0 || bookingMonthComboBox.getSelectedIndex() == 0 || bookingYearComboBox.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(null, "Please select a valid date!");
                    } else {
                        if (vehicles.size() == 0) {
                            JOptionPane.showMessageDialog(null, "Can't book a ride for vehicle with ID: " + vehicleId + "\nNo Auto Rickshaw with that ID are found in the system!/nPlease add one first");
                        } else {
                            AutoRickshaw autoRickshaw = getAutoRickshawById(vehicleId);
                            if (autoRickshaw != null) {
                                if (autoRickshaw.getIsBooked()) {
                                    JOptionPane.showMessageDialog(null, "Can't book a ride for vehicle with ID: " + vehicleId + "\nThe Auto Rickshaw is already booked!");
                                } else {
                                    autoRickshaw.bookRickshaw(bookingDate, chargeAmount, numberOfSeats);
                                    JOptionPane.showMessageDialog(null, "Auto Rickshaw booked successfully!");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Not an auto rickshaw!");
                            }
                        }
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "VehicleID,\nCharge Amount,\nNumber of Seats must be integers");
                }
            }
        });


        JButton clearButton = new JButton("Clear");
        clearButton.setFont(smallFont);
        clearButton.setBackground(sidebarBG);
        clearButton.setForeground(Color.WHITE);
        clearButton.setBorder(buttonBorder);
        clearButton.setFocusable(false);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 9;
        bookArPanel.add(clearButton, gbc);

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vehicleIDField.setText("");
                chargeAmountField.setText("");
                numberOfSeatsField.setText("");
                bookingDateComboBox.setSelectedIndex(0);
                bookingMonthComboBox.setSelectedIndex(0);
                bookingYearComboBox.setSelectedIndex(0);
            }
        });

        return bookArPanel;
    }

    /*
        this method returns JPanel i.e., purchaseEsPanel which is called upon button click of esPurchaseButton on sidebar panel and added to mainContentPanel panel in the content panel.
        The returned panel has necessary text field that are necessary to input data for booking an auto rickshaw such as id, charge amount, etc. After entering values, the method calls
        action listener on clicking bookButton that performs validation of information entered on text fields and proceeds to the purchase by passing the values from text field to the
        purchase method of electric scooter class but if the information is wrong the user is notified accordingly. Additionally, exceptions are also caught such as NumberFormatException.
    */
    public JPanel purchaseEsPanel() {
        GridBagConstraints gbc = new GridBagConstraints();
        JPanel purchaseEsPanel = new JPanel();
        purchaseEsPanel.setBackground(mainContentBG);
        purchaseEsPanel.setLayout(new GridBagLayout());

        JLabel vehicleIDLabel = new JLabel("Vehicle ID");
        vehicleIDLabel.setFont(smallFont);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = insets;
        gbc.gridx = 0;
        gbc.gridy = 0;
        purchaseEsPanel.add(vehicleIDLabel, gbc);

        vehicleIDField = new JTextField(10);
        vehicleIDField.setFont(smallFont);

        vehicleIDField.setForeground(Color.GRAY);
        vehicleIDField.setText("");


        vehicleIDField.setBorder(textFieldBorder);
        gbc.gridx = 1;
        purchaseEsPanel.add(vehicleIDField, gbc);

        vehicleIDField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                try {
                    ElectricScooter electricScooter = getElectricScooterById(Integer.parseInt(vehicleIDField.getText()));
                    if (electricScooter != null) {
                        JOptionPane.showMessageDialog(null, "Vehicle Name: " + electricScooter.getVehicleName() + "\n" + "Vehicle Color: " + electricScooter.getVehicleColor() + "\n" + "Vehicle Weight: " + electricScooter.getVehicleWeight() + "\n" + "Vehicle Speed: " + electricScooter.getVehicleSpeed());
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vehicle ID must be an integer!");
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });

        JLabel vehicleBrandLabel = new JLabel("Vehicle Brand");
        vehicleBrandLabel.setFont(smallFont);
        gbc.gridx = 0;
        gbc.gridy = 1;
        purchaseEsPanel.add(vehicleBrandLabel, gbc);

        vehicleBrandField = new JTextField(10);
        vehicleBrandField.setFont(smallFont);

        vehicleBrandField.setForeground(Color.GRAY);
        vehicleBrandField.setText("");

        vehicleBrandField.setBorder(textFieldBorder);
        gbc.gridx = 1;
        purchaseEsPanel.add(vehicleBrandField, gbc);

        JLabel vehiclePriceLabel = new JLabel("Vehicle Price");
        vehiclePriceLabel.setFont(smallFont);
        gbc.gridx = 0;
        gbc.gridy = 2;
        purchaseEsPanel.add(vehiclePriceLabel, gbc);

        vehiclePriceField = new JTextField(10);
        vehiclePriceField.setFont(smallFont);

        vehiclePriceField.setForeground(Color.GRAY);
        vehiclePriceField.setText("");

        vehiclePriceField.setBorder(textFieldBorder);
        gbc.gridx = 1;
        purchaseEsPanel.add(vehiclePriceField, gbc);

        JLabel chargingTimeLabel = new JLabel("Charging Time");
        chargingTimeLabel.setFont(smallFont);
        gbc.gridx = 0;
        gbc.gridy = 3;
        purchaseEsPanel.add(chargingTimeLabel, gbc);

        vehicleChargingTimeField = new JTextField(10);
        vehicleChargingTimeField.setFont(smallFont);

        vehicleChargingTimeField.setForeground(Color.GRAY);
        vehicleChargingTimeField.setText("");

        vehicleChargingTimeField.setBorder(textFieldBorder);
        gbc.gridx = 1;
        purchaseEsPanel.add(vehicleChargingTimeField, gbc);

        JLabel vehicleMileageLabel = new JLabel("Vehicle Mileage");
        vehicleMileageLabel.setFont(smallFont);
        gbc.gridx = 0;
        gbc.gridy = 4;
        purchaseEsPanel.add(vehicleMileageLabel, gbc);

        vehicleMileageField = new JTextField(10);
        vehicleMileageField.setFont(smallFont);

        vehicleMileageField.setForeground(Color.GRAY);
        vehicleMileageField.setText("");

        vehicleMileageField.setBorder(textFieldBorder);
        gbc.gridx = 1;
        purchaseEsPanel.add(vehicleMileageField, gbc);

        JLabel vehicleRangeLabel = new JLabel("Vehicle Range");
        vehicleRangeLabel.setFont(smallFont);
        gbc.gridx = 0;
        gbc.gridy = 5;
        purchaseEsPanel.add(vehicleRangeLabel, gbc);

        vehicleRangeField = new JTextField(10);
        vehicleRangeField.setFont(smallFont);

        vehicleRangeField.setForeground(Color.GRAY);
        vehicleRangeField.setText("");

        vehicleRangeField.setBorder(textFieldBorder);
        gbc.gridx = 1;
        purchaseEsPanel.add(vehicleRangeField, gbc);

        JButton purchaseButton = new JButton("Purchase");
        purchaseButton.setFont(smallFont);
        purchaseButton.setBackground(sidebarBG);
        purchaseButton.setForeground(Color.WHITE);
        purchaseButton.setBorder(buttonBorder);
        purchaseButton.setFocusable(false);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 6;
        purchaseEsPanel.add(purchaseButton, gbc);

        purchaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int vehicleId = Integer.parseInt(vehicleIDField.getText());
                    int vehiclePrice = Integer.parseInt(vehiclePriceField.getText());
                    int vehicleRange = Integer.parseInt(vehicleRangeField.getText());

                    String vehicleBrand = vehicleBrandField.getText();
                    String vehicleMileage = vehicleMileageField.getText();
                    String vehicleChargingTime = vehicleChargingTimeField.getText();
                    if (vehicles.size() == 0) {
                        JOptionPane.showMessageDialog(null, "Can't purchase an electric scooter with ID: " + vehicleId + "\nNo vehicles are found in the system!\nPlease Add one first");
                    } else {
                        ElectricScooter electricScooter = getElectricScooterById(vehicleId);
                        if (electricScooter != null) {
                            if (electricScooter.getHasPurchased()) {
                                JOptionPane.showMessageDialog(null, "Can't purchase an electric scooter with ID: " + vehicleId + "\nThe vehicle has already been purchased!");
                            } else {
                                electricScooter.purchaseScooter(vehicleBrand, vehiclePrice, vehicleChargingTime, vehicleMileage, vehicleRange);
                                JOptionPane.showMessageDialog(null, "Vehicle with ID: " + vehicleId + " has been purchased!");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "The vehicle is not an electric scooter!");
                        }
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "VehicleID,\nVehicle Price, \nVehicle Range must be integers");
                }
            }
        });


        JButton clearButton = new JButton("Clear");
        clearButton.setFont(smallFont);
        clearButton.setBackground(sidebarBG);
        clearButton.setForeground(Color.WHITE);
        clearButton.setBorder(buttonBorder);
        clearButton.setFocusable(false);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 6;
        purchaseEsPanel.add(clearButton, gbc);

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vehicleIDField.setText("");
                vehicleBrandField.setText("");
                vehiclePriceField.setText("");
                vehicleChargingTimeField.setText("");
                vehicleMileageField.setText("");
                vehicleRangeField.setText("");
            }
        });

        return purchaseEsPanel;
    }

    /*
        This method returns JPanel i.e., sellEsPanel which is called upon button click of esSellButton on sidebar panel and added to mainContentPanel panel in the content panel. The returned
        panel has necessary text field that are necessary to input data for selling an electric scooter such as id, and price. After entering values, the method calls action listener on clicking
        sellButton that performs validation of information entered on text fields and proceeds to the sell by passing the values from text field to the sell method of electric scooter class but
        if the information is wrong the user is notified accordingly. Additionally, exceptions are also caught such as NumberFormatException.
    */

    public JPanel sellEsPanel() {
        JPanel sellEsPanel = new JPanel();
        sellEsPanel.setLayout(new GridBagLayout());
        sellEsPanel.setBackground(mainContentBG);
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel vehicleIDLabel = new JLabel("Vehicle ID");
        vehicleIDLabel.setFont(smallFont);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = insets;
        gbc.gridx = 0;
        gbc.gridy = 0;
        sellEsPanel.add(vehicleIDLabel, gbc);

        vehicleIDField = new JTextField(10);
        vehicleIDField.setFont(smallFont);

        vehicleIDField.setForeground(Color.GRAY);
        vehicleIDField.setText("");


        vehicleIDField.setBorder(textFieldBorder);
        gbc.gridx = 1;
        sellEsPanel.add(vehicleIDField, gbc);

        vehicleIDField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                try {
                    ElectricScooter electricScooter = getElectricScooterById(Integer.parseInt(vehicleIDField.getText()));
                    if (electricScooter != null) {
                        JOptionPane.showMessageDialog(null, "Vehicle Name: " + electricScooter.getVehicleName() + "\n" + "Vehicle Color: " + electricScooter.getVehicleColor() + "\n" + "Vehicle Weight: " + electricScooter.getVehicleWeight() + "\n" + "Vehicle Speed: " + electricScooter.getVehicleSpeed());
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vehicle ID must be an integer!");
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });

        JLabel vehiclePriceLabel = new JLabel("Vehicle Price");
        vehiclePriceLabel.setFont(smallFont);
        gbc.gridx = 0;
        gbc.gridy = 1;
        sellEsPanel.add(vehiclePriceLabel, gbc);

        vehiclePriceField = new JTextField(10);
        vehiclePriceField.setFont(smallFont);

        vehiclePriceField.setForeground(Color.GRAY);
        vehiclePriceField.setText("");

        vehiclePriceField.setBorder(textFieldBorder);
        gbc.gridx = 1;
        sellEsPanel.add(vehiclePriceField, gbc);

        JButton sellButton = new JButton("Sell");
        sellButton.setFont(smallFont);
        sellButton.setBackground(sidebarBG);
        sellButton.setForeground(Color.WHITE);
        sellButton.setBorder(buttonBorder);
        sellButton.setFocusable(false);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 2;
        sellEsPanel.add(sellButton, gbc);

        sellButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int vehicleId = Integer.parseInt(vehicleIDField.getText());
                    int vehiclePrice = Integer.parseInt(vehiclePriceField.getText());
                    if (vehicles.size() == 0) {
                        JOptionPane.showMessageDialog(null, "Can't sell an electric scooter for vehicle with ID: " + vehicleId + "\nNo vehicles are found in the system!/Please add one first");
                    } else {
                        ElectricScooter electricScooter = getElectricScooterById(vehicleId);
                        if (electricScooter != null) {
                            if (!electricScooter.getHasPurchased()) {
                                JOptionPane.showMessageDialog(null, "Can't sell an electric scooter for vehicle with ID: " + vehicleId + "\nThe scooter has not been purchased yet!");
                            } else {
                                electricScooter.sellScooter(vehiclePrice);
                                JOptionPane.showMessageDialog(null, "Vehicle with ID: " + vehicleId + " has been sold!");
                            }
                        }else {
                            JOptionPane.showMessageDialog(null, "The vehicle is not an electric scooter!");
                        }
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "VehicleID,\nVehicle Price must be integers");
                }
            }
        });

        JButton clearButton = new JButton("Clear");
        clearButton.setFont(smallFont);
        clearButton.setBackground(sidebarBG);
        clearButton.setForeground(Color.WHITE);
        clearButton.setBorder(buttonBorder);
        clearButton.setFocusable(false);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 2;
        sellEsPanel.add(clearButton, gbc);

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vehicleIDField.setText("");
                vehiclePriceField.setText("");
            }
        });

        return sellEsPanel;
    }

    /*
        This method creates a new full screen frame with default close operation of dispose. The frame consists of JLables and JTables that display all
        data stored in the arraylist entered by the user.
    */

    public void displayFrame() {
        JFrame displayFrame = new JFrame();
        displayFrame.setTitle("Display");
        displayFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        displayFrame.setLocationRelativeTo(null);
        displayFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new BorderLayout());
        JPanel displayTopPanel = new JPanel();
        displayTopPanel.setLayout(new BorderLayout());
        JPanel labelAndButtonPanel = new JPanel();
        labelAndButtonPanel.setLayout(new BorderLayout());
        JLabel autoRickTableLabel = new JLabel("Auto Rickshaw Information");
        autoRickTableLabel.setFont(smallFont);
        labelAndButtonPanel.add(autoRickTableLabel, BorderLayout.WEST);
        JButton clearButton = new JButton("Clear");
        clearButton.setFont(smallFont);
        clearButton.setBackground(sidebarBG);
        clearButton.setForeground(Color.WHITE);
        clearButton.setFocusable(false);
        labelAndButtonPanel.add(clearButton, BorderLayout.EAST);

        displayTopPanel.add(labelAndButtonPanel, BorderLayout.NORTH);

        String[] arTableHeader = {"ID", "Name", "Weight", "Color", "Speed", "Engine Displacement", "Torque", "Fuel Tank Capacity", "Ground Clearance", "Booked", "Booking Date", "Seats", "Charge Amount"};
        Object[][] arData = new Object[getCountOfAr()][arTableHeader.length];

        int arTableRow = 0;
        // Placing values in the array that'll be displayed in the JTable
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof AutoRickshaw) {
                autoRickshaw = (AutoRickshaw) vehicle;
                int arTableColumn = 0;
                arData[arTableRow][arTableColumn++] = autoRickshaw.getVehicleId();
                arData[arTableRow][arTableColumn++] = autoRickshaw.getVehicleName();
                arData[arTableRow][arTableColumn++] = autoRickshaw.getVehicleWeight();
                arData[arTableRow][arTableColumn++] = autoRickshaw.getVehicleColor();
                arData[arTableRow][arTableColumn++] = autoRickshaw.getVehicleSpeed();
                arData[arTableRow][arTableColumn++] = autoRickshaw.getEngineDisplacement();
                arData[arTableRow][arTableColumn++] = autoRickshaw.getTorque();
                arData[arTableRow][arTableColumn++] = autoRickshaw.getFuelTankCapacity();
                arData[arTableRow][arTableColumn++] = autoRickshaw.getGroundClearance();
                arData[arTableRow][arTableColumn++] = autoRickshaw.getIsBooked();
                arData[arTableRow][arTableColumn++] = autoRickshaw.getBookedDate();
                arData[arTableRow][arTableColumn++] = autoRickshaw.getNumberOfSeats();
                arData[arTableRow][arTableColumn] = autoRickshaw.getChargeAmount();
                arTableRow++;
            }
        }

        JTable autoRickshawTable = new JTable(arData, arTableHeader);
        autoRickshawTable.setRowHeight(50);
        autoRickshawTable.setEnabled(false);
        JTableHeader th = autoRickshawTable.getTableHeader();
        th.setFont(tableFont);
        th.setReorderingAllowed(false);
        autoRickshawTable.setFont(tableFont);

        JScrollPane scrollPane = new JScrollPane(autoRickshawTable);
        scrollPane.setBackground(mainContentBG);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        displayTopPanel.add(scrollPane, BorderLayout.CENTER);
        displayPanel.add(displayTopPanel, BorderLayout.NORTH);

        JPanel displayBottomPanel = new JPanel();
        displayBottomPanel.setLayout(new BorderLayout());
        JLabel electricScooterTableLabel = new JLabel("Electric Scooter Information");
        electricScooterTableLabel.setFont(smallFont);
        displayBottomPanel.add(electricScooterTableLabel, BorderLayout.NORTH);

        String[] esTableHeader = {"ID", "Name", "Weight", "Color", "Speed", "Battery Capacity", "Brand", "Price", "Charging Time", "Mileage", "Range", "Available"};
        Object[][] esData = new Object[vehicles.size() - getCountOfAr()][esTableHeader.length];

        int esTableRow = 0;
        // Placing values in the array that'll be displayed in the JTable
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof ElectricScooter) {
                electricScooter = (ElectricScooter) vehicle;
                int esTableColumn = 0;
                esData[esTableRow][esTableColumn++] = electricScooter.getVehicleId();
                esData[esTableRow][esTableColumn++] = electricScooter.getVehicleName();
                esData[esTableRow][esTableColumn++] = electricScooter.getVehicleWeight();
                esData[esTableRow][esTableColumn++] = electricScooter.getVehicleColor();
                esData[esTableRow][esTableColumn++] = electricScooter.getVehicleSpeed();
                esData[esTableRow][esTableColumn++] = electricScooter.getBatteryCapacity();
                esData[esTableRow][esTableColumn++] = electricScooter.getBrandName();
                esData[esTableRow][esTableColumn++] = electricScooter.getPrice();
                esData[esTableRow][esTableColumn++] = electricScooter.getChargingTime();
                esData[esTableRow][esTableColumn++] = electricScooter.getMileage();
                esData[esTableRow][esTableColumn++] = electricScooter.getRange();
                esData[esTableRow][esTableColumn] = electricScooter.getHasSold();
                esTableRow++;
            }
        }

        JTable electricScooterTable = new JTable(esData, esTableHeader);
        electricScooterTable.setRowHeight(50);
        electricScooterTable.setEnabled(false);
        JTableHeader th2 = electricScooterTable.getTableHeader();
        th2.setReorderingAllowed(false);
        th2.setFont(tableFont);
        electricScooterTable.setFont(tableFont);


        JScrollPane scrollPane2 = new JScrollPane(electricScooterTable);
        scrollPane2.setBackground(mainContentBG);
        scrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        displayBottomPanel.add(scrollPane2, BorderLayout.CENTER);

        displayPanel.add(displayBottomPanel, BorderLayout.SOUTH);
        displayFrame.add(displayPanel);
        displayFrame.setVisible(true);

        //Clears the arraylist of vehicles and closes the display frame.
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vehicles.clear();
                JOptionPane.showMessageDialog(null, "All vehicles have been cleared");
                displayFrame.dispose();
            }
        });

    }

    /*
        This method is used to get the count of AutoRickshaw vehicles in the ArrayList
    */
    public int getCountOfAr() {
        int count = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof AutoRickshaw) {
                count++;
            }
        }
        return count;
    }

    /*
        This method is used to get the corresponding auto rickshaw vehicle from the ArrayList based on the vehicle ID
    */
    public AutoRickshaw getAutoRickshawById(int id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId() == id && vehicle instanceof AutoRickshaw) {
                return (AutoRickshaw) vehicle; //returns the auto rickshaw vehicle with the corresponding ID if it exists
            }
        }
        return null;
    }

    /*
        This method is used to get the corresponding electric scooter vehicle from the ArrayList based on the vehicle ID
    */
    public ElectricScooter getElectricScooterById(int id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId() == id && vehicle instanceof ElectricScooter) {
                return (ElectricScooter) vehicle; //returns the electric scooter object if the vehicle ID matches the parameter ID if it exists
            }
        }
        return null;
    }

    /*
        Entry point of the program
    */
    public static void main(String[] args) {
        new TransportGUI();
    }
}