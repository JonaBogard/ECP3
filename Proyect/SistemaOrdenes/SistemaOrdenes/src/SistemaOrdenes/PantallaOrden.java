package SistemaOrdenes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaOrden {

	private JFrame frmSistemaOrdenes;
	private JTextField txtOrderId;
	private JTextField txtDate;
	private JTextField txtName;
	private JTextField txtAddress;
	private JTextField txtCity;
	private JTextField txtState;
	private JTextField txtPostalCode;
	private JTextField txtCountry;
	private JTextField txtRegion;
	private JTextField txtNotes;
	private JTextField txtTaxes;
	private JButton btnActualizar;
	private JButton btnConsultar;
	private JButton btnInsertar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaOrden window = new PantallaOrden();
					window.frmSistemaOrdenes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PantallaOrden() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSistemaOrdenes = new JFrame();
		frmSistemaOrdenes.setTitle("Sistema Ordenes");
		frmSistemaOrdenes.setBounds(100, 100, 450, 430);
		frmSistemaOrdenes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSistemaOrdenes.getContentPane().setLayout(null);

		JLabel lblOrderId = new JLabel("Id");
		lblOrderId.setBounds(71, 11, 80, 14);
		frmSistemaOrdenes.getContentPane().add(lblOrderId);

		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(71, 36, 80, 14);
		frmSistemaOrdenes.getContentPane().add(lblDate);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(71, 61, 80, 14);
		frmSistemaOrdenes.getContentPane().add(lblName);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(71, 86, 80, 14);
		frmSistemaOrdenes.getContentPane().add(lblAddress);

		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(71, 111, 80, 14);
		frmSistemaOrdenes.getContentPane().add(lblCity);

		JLabel lblState = new JLabel("State");
		lblState.setBounds(71, 136, 80, 14);
		frmSistemaOrdenes.getContentPane().add(lblState);

		JLabel lblPostalcode = new JLabel("PostalCode");
		lblPostalcode.setBounds(71, 161, 80, 14);
		frmSistemaOrdenes.getContentPane().add(lblPostalcode);

		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(71, 186, 80, 14);
		frmSistemaOrdenes.getContentPane().add(lblCountry);

		JLabel lblRegion = new JLabel("Region");
		lblRegion.setBounds(71, 211, 80, 14);
		frmSistemaOrdenes.getContentPane().add(lblRegion);

		JLabel lblCountry_1_1 = new JLabel("Notes");
		lblCountry_1_1.setBounds(71, 236, 80, 14);
		frmSistemaOrdenes.getContentPane().add(lblCountry_1_1);

		JLabel lblCountry_1_2 = new JLabel("Taxes");
		lblCountry_1_2.setBounds(71, 261, 80, 14);
		frmSistemaOrdenes.getContentPane().add(lblCountry_1_2);

		txtOrderId = new JTextField();
		txtOrderId.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtOrderId.getText().length() >= 5) {
					e.consume();
				}
			}
		});
		txtOrderId.setBounds(205, 8, 151, 20);
		frmSistemaOrdenes.getContentPane().add(txtOrderId);
		txtOrderId.setColumns(10);

		txtDate = new JTextField();
		txtDate.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtDate.getText().length() >= 10) {
					e.consume();
				}
			}
		});
		txtDate.setColumns(10);
		txtDate.setBounds(205, 33, 151, 20);
		frmSistemaOrdenes.getContentPane().add(txtDate);

		txtName = new JTextField();
		txtName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtName.getText().length() >= 30) {
					e.consume();
				}
			}
		});
		txtName.setColumns(10);
		txtName.setBounds(205, 58, 151, 20);
		frmSistemaOrdenes.getContentPane().add(txtName);

		txtAddress = new JTextField();
		txtAddress.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtAddress.getText().length() >= 50) {
					e.consume();
				}
			}
		});
		txtAddress.setColumns(10);
		txtAddress.setBounds(205, 83, 151, 20);
		frmSistemaOrdenes.getContentPane().add(txtAddress);

		txtCity = new JTextField();
		txtCity.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtCity.getText().length() >= 50) {
					e.consume();
				}
			}
		});
		txtCity.setColumns(10);
		txtCity.setBounds(205, 108, 151, 20);
		frmSistemaOrdenes.getContentPane().add(txtCity);

		txtState = new JTextField();
		txtState.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtState.getText().length() >= 50) {
					e.consume();
				}
			}
		});
		txtState.setColumns(10);
		txtState.setBounds(205, 133, 151, 20);
		frmSistemaOrdenes.getContentPane().add(txtState);

		txtPostalCode = new JTextField();
		txtPostalCode.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtPostalCode.getText().length() >= 50) {
					e.consume();
				}
			}
		});
		txtPostalCode.setColumns(10);
		txtPostalCode.setBounds(205, 158, 151, 20);
		frmSistemaOrdenes.getContentPane().add(txtPostalCode);

		txtCountry = new JTextField();
		txtCountry.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtCountry.getText().length() >= 50) {
					e.consume();
				}
			}
		});
		txtCountry.setColumns(10);
		txtCountry.setBounds(205, 183, 151, 20);
		frmSistemaOrdenes.getContentPane().add(txtCountry);

		txtRegion = new JTextField();
		txtRegion.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtRegion.getText().length() >= 50) {
					e.consume();
				}
			}
		});
		txtRegion.setColumns(10);
		txtRegion.setBounds(205, 208, 151, 20);
		frmSistemaOrdenes.getContentPane().add(txtRegion);

		txtNotes = new JTextField();
		txtNotes.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtNotes.getText().length() >= 50) {
					e.consume();
				}
			}
		});
		txtNotes.setColumns(10);
		txtNotes.setBounds(205, 233, 151, 20);
		frmSistemaOrdenes.getContentPane().add(txtNotes);

		txtTaxes = new JTextField();
		txtTaxes.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtTaxes.getText().length() >= 50) {
					e.consume();
				}
			}
		});
		txtTaxes.setColumns(10);
		txtTaxes.setBounds(205, 258, 151, 20);
		frmSistemaOrdenes.getContentPane().add(txtTaxes);

		btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					NegocioOrden no = new NegocioOrden();
					no.setOrderId(txtOrderId.getText());
					no.setDate(txtDate.getText());
					no.setName(txtName.getText());
					no.setAddress(txtAddress.getText());
					no.setCity(txtCity.getText());
					no.setState(txtState.getText());
					no.setPostalCode(txtPostalCode.getText());
					no.setCountry(txtCountry.getText());
					no.setRegion(txtRegion.getText());
					no.setNotes(txtNotes.getText());
					no.setTaxes(txtTaxes.getText());
					limpiar();
					if (no.insertarOrden()) {
						limpiar();
						JOptionPane.showMessageDialog(null, "Orden Registrada");
					} else {
						JOptionPane.showMessageDialog(null, "Error al insertar");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Error al insertar");
				}
			}
		});
		btnInsertar.setBounds(44, 308, 89, 23);
		frmSistemaOrdenes.getContentPane().add(btnInsertar);

		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String OrderId = JOptionPane.showInputDialog("ID de la orden");
					NegocioOrden no = new NegocioOrden();
					no.setOrderId(OrderId);
					if (no.consultarOrden()) {
						txtOrderId.setText("" + no.getOrderId());
						txtDate.setText("" + no.getDate());
						txtName.setText("" + no.getName());
						txtAddress.setText("" + no.getAddress());
						txtCity.setText("" + no.getCity());
						txtState.setText("" + no.getState());
						txtPostalCode.setText("" + no.getPostalCode());
						txtCountry.setText("" + no.getCountry());
						txtRegion.setText("" + no.getRegion());
						txtNotes.setText("" + no.getNotes());
						txtTaxes.setText("" + no.getTaxes());
						JOptionPane.showMessageDialog(null, "Orden Encontrada");
					} else {
						JOptionPane.showMessageDialog(null, "Error al encontrar la orden");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Error al encontrar la orden");
				}
			}
		});
		btnConsultar.setBounds(168, 308, 89, 23);
		frmSistemaOrdenes.getContentPane().add(btnConsultar);

		btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					NegocioOrden no = new NegocioOrden();
					no.setOrderId(txtOrderId.getText());
					no.setDate(txtDate.getText());
					no.setName(txtName.getText());
					no.setAddress(txtAddress.getText());
					no.setCity(txtCity.getText());
					no.setState(txtState.getText());
					no.setPostalCode(txtPostalCode.getText());
					no.setCountry(txtCountry.getText());
					no.setRegion(txtRegion.getText());
					no.setNotes(txtNotes.getText());
					no.setTaxes(txtTaxes.getText());
					if (no.actualizarOrden()) {
						limpiar();
						JOptionPane.showMessageDialog(null, "Datos de la orden actualizada");
					} else {
						JOptionPane.showMessageDialog(null, "Error al actualizar orden");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Error al actualizar orden");
				}
			}
		});
		btnActualizar.setBounds(290, 308, 89, 23);
		frmSistemaOrdenes.getContentPane().add(btnActualizar);
	}

	public void limpiar() {
		txtOrderId.setText("");
		txtDate.setText("");
		txtName.setText("");
		txtAddress.setText("");
		txtCity.setText("");
		txtState.setText("");
		txtPostalCode.setText("");
		txtCountry.setText("");
		txtRegion.setText("");
		txtNotes.setText("");
		txtTaxes.setText("");
	}
}
