package Sistema;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;

public class vistaProducto {

	private JFrame frmCrudaProductos;
	private JTextField txtId;
	private JTextField txtNombre;
	private JTextField txtPrecio;
	private JTextField txtProveedor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaProducto window = new vistaProducto();
					window.frmCrudaProductos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public vistaProducto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCrudaProductos = new JFrame();
		frmCrudaProductos.getContentPane().setBackground(new Color(255, 204, 204));
		frmCrudaProductos.setTitle("CRUDA Productos");
		frmCrudaProductos.setBounds(100, 100, 430, 300);
		frmCrudaProductos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCrudaProductos.getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(68, 35, 46, 14);
		frmCrudaProductos.getContentPane().add(lblId);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(68, 60, 70, 14);
		frmCrudaProductos.getContentPane().add(lblNombre);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(68, 85, 70, 14);
		frmCrudaProductos.getContentPane().add(lblPrecio);
		
		JLabel lblId_2_1 = new JLabel("Proveedor");
		lblId_2_1.setBounds(68, 110, 70, 14);
		frmCrudaProductos.getContentPane().add(lblId_2_1);
		
		txtId = new JTextField();
		txtId.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtId.getText().length()>=3) {
					e.consume();
					}
			}
		});
		txtId.setBounds(192, 32, 138, 20);
		frmCrudaProductos.getContentPane().add(txtId);
		txtId.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtNombre.getText().length()>=10) {
					e.consume();
					}
			}
		});
		txtNombre.setColumns(10);
		txtNombre.setBounds(192, 57, 138, 20);
		frmCrudaProductos.getContentPane().add(txtNombre);
		
		txtPrecio = new JTextField();
		txtPrecio.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtPrecio.getText().length()>=3) {
					e.consume();
					}
			}
		});
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(192, 82, 138, 20);
		frmCrudaProductos.getContentPane().add(txtPrecio);
		
		txtProveedor = new JTextField();
		txtProveedor.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtProveedor.getText().length()>=20) {
					e.consume();
					}
			}
		});
		txtProveedor.setColumns(10);
		txtProveedor.setBounds(192, 107, 138, 20);
		frmCrudaProductos.getContentPane().add(txtProveedor);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.setBounds(49, 161, 89, 23);
		frmCrudaProductos.getContentPane().add(btnInsertar);
		
		JButton btnCargar = new JButton("Cargar");
		btnCargar.setBounds(165, 161, 89, 23);
		frmCrudaProductos.getContentPane().add(btnCargar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(281, 161, 89, 23);
		frmCrudaProductos.getContentPane().add(btnEliminar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(108, 195, 89, 23);
		frmCrudaProductos.getContentPane().add(btnActualizar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(226, 195, 89, 23);
		frmCrudaProductos.getContentPane().add(btnLimpiar);
	}
}
