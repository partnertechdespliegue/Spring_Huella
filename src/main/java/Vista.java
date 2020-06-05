import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.zkteco.biometric.FingerprintSensorErrorCode;
import com.zkteco.biometric.FingerprintSensorEx;

public class Vista extends JFrame{
	
	public Vista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOpen = new javax.swing.JButton();
        btnEnroll = new javax.swing.JButton();
        btnIdentify = new javax.swing.JButton();
        btnRegImg = new javax.swing.JButton();
        btnVerImg = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        radioANSI = new javax.swing.JRadioButton();
        radioISO = new javax.swing.JRadioButton();
        radioZK = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        btnImg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnOpen.setText("Open");
        btnOpen.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent evt) {
				//btnOpenActionPerformed(evt);
				Asistencia asistencia = new Asistencia();
				asistencia.setIdAsistencia(1);
				Consumir consumir = new Consumir();
				String webservice = "asistencia/registrar";
				consumir.conexionAppPagos(asistencia, webservice);
				//consumir.insertaEmpresaEfipagos(webservice);
				
			}
		}); 

        btnEnroll.setText("Enroll");
        btnEnroll.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnrollActionPerformed(evt);
            }
        });

        btnIdentify.setText("Identify");
        btnIdentify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdentifyActionPerformed(evt);
            }
        });

        btnRegImg.setText("Register by image");
        btnRegImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegImgActionPerformed(evt);
            }
        });

        btnVerImg.setText("Verify by image");
        btnVerImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerImgActionPerformed(evt);
            }
        });

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        radioANSI.setText("ANSI");

        radioISO.setText("ISO");

        radioZK.setText("ZK");

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOpen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEnroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIdentify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addComponent(btnImg, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(radioANSI)
                            .addGap(18, 18, 18)
                            .addComponent(radioISO)
                            .addGap(18, 18, 18)
                            .addComponent(radioZK))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEnroll, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIdentify, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegImg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVerImg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClose))
                    .addComponent(btnImg, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioANSI)
                    .addComponent(radioISO)
                    .addComponent(radioZK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        int fpWidth = 0;
	//la altura de la imagen de la huella digital
	int fpHeight = 0;
	//para verificar la prueba
	private byte[] lastRegTemp = new byte[2048];
	//la longitud de lastRegTemp
	private int cbRegTemp = 0;
	//pre-register template
	private byte[][] regtemparray = new byte[3][2048];
	//registrarse
	private boolean bRegister = false;
	//identificar
	private boolean bIdentify = true;
	//identificacion de la huella
	private int iFid = 1;
	
	private int nFakeFunOn = 1;
	//debe ser 3
	static final int enroll_cnt = 3;
	//the index of pre-register function
	private int enroll_idx = 0;
	
	private byte[] imgbuf = null;
	private byte[] template = new byte[2048];
	private int[] templateLen = new int[1];
	
	
	private boolean mbStop = true;
	private long mhDevice = 0;
	private long mhDB = 0;
	private WorkThread workThread = null;
    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        if (0 != mhDevice)
            {
                    //already inited
                    textArea.setText("Please close device first!\n");
                    return;
            }
            int ret = FingerprintSensorErrorCode.ZKFP_ERR_OK;
            //Initialize
            cbRegTemp = 0;
            bRegister = false;
            bIdentify = false;
            iFid = 1;
            enroll_idx = 0;
            if (FingerprintSensorErrorCode.ZKFP_ERR_OK != FingerprintSensorEx.Init())
            {
                    textArea.setText("Init failed!\n");
                    return;
            }
            ret = FingerprintSensorEx.GetDeviceCount();
            if (ret < 0)
            {
                    textArea.setText("No devices connected!\n");
                    FreeSensor();
                    return;
            }
            if (0 == (mhDevice = FingerprintSensorEx.OpenDevice(0)))
            {
                    textArea.setText("Open device fail, ret = " + ret + "!\n");
                    FreeSensor();
                    return;
            }
            if (0 == (mhDB = FingerprintSensorEx.DBInit()))
            {
                    textArea.setText("Init DB fail, ret = " + ret + "!\n");
                    FreeSensor();
                    return;
            }

            //For ISO/Ansi
            int nFmt = 0;	//Ansi
            if (radioISO.isSelected())
            {
                    nFmt = 1;	//ISO
            }
            FingerprintSensorEx.DBSetParameter(mhDB,  5010, nFmt);				
            //For ISO/Ansi End

            //set fakefun off
            //FingerprintSensorEx.SetParameter(mhDevice, 2002, changeByte(nFakeFunOn), 4);

            byte[] paramValue = new byte[4];
            int[] size = new int[1];
            //GetFakeOn
            //size[0] = 4;
            //FingerprintSensorEx.GetParameters(mhDevice, 2002, paramValue, size);
            //nFakeFunOn = byteArrayToInt(paramValue);

            size[0] = 4;
            FingerprintSensorEx.GetParameters(mhDevice, 1, paramValue, size);
            fpWidth = byteArrayToInt(paramValue);
            size[0] = 4;
            FingerprintSensorEx.GetParameters(mhDevice, 2, paramValue, size);
            fpHeight = byteArrayToInt(paramValue);

            imgbuf = new byte[fpWidth*fpHeight];
            //btnImg.resize(fpWidth, fpHeight);
            mbStop = false;
            workThread = new WorkThread();
        workThread.start();// 线程�?�动
            textArea.setText("Open succ! Finger Image Width:" + fpWidth + ",Height:" + fpHeight +"\n");

    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
	FreeSensor();			
	textArea.setText("Close succ!\n");			
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnEnrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnrollActionPerformed
        if(0 == mhDevice){
                textArea.setText("Please Open device first!\n");
                return;
        }
        if(!bRegister){
            enroll_idx = 0;
            bRegister = true;
            textArea.setText("Please your finger 3 times!\n");
        }	
    }//GEN-LAST:event_btnEnrollActionPerformed

    private void btnIdentifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdentifyActionPerformed
        
        if(0 == mhDevice){
                textArea.setText("Please Open device first!\n");
                return;
        }
        if(bRegister){
                enroll_idx = 0;
                bRegister = false;
        }
        if(!bIdentify){
                bIdentify = true;
        }
			
    }//GEN-LAST:event_btnIdentifyActionPerformed

    private void btnRegImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegImgActionPerformed
       
        if(0 == mhDB)
        {
                textArea.setText("Please open device first!\n");
        }
        String path = "d:\\test\\fingerprint.bmp";
        byte[] fpTemplate = new byte[2048];
        int[] sizeFPTemp = new int[1];
        sizeFPTemp[0] = 2048;
        int ret = FingerprintSensorEx.ExtractFromImage( mhDB, path, 500, fpTemplate, sizeFPTemp);		
        if (0 == ret){
                ret = FingerprintSensorEx.DBAdd( mhDB, iFid, fpTemplate);
                if (0 == ret){
                    //String base64 = fingerprintSensor.BlobToBase64(fpTemplate, sizeFPTemp[0]);		
                    iFid++;
                    cbRegTemp = sizeFPTemp[0];
                    System.arraycopy(fpTemplate, 0, lastRegTemp, 0, cbRegTemp);
                    //Base64 Template
                    //String strBase64 = Base64.encodeToString(regTemp, 0, ret, Base64.NO_WRAP);
                    textArea.setText("enroll succ\n");
                }else{
                    textArea.setText("DBAdd fail, ret=" + ret + "\n");
                }
        }else{
            textArea.setText("ExtractFromImage fail, ret=" + ret + "\n");
        }
			
    }//GEN-LAST:event_btnRegImgActionPerformed

    private void btnVerImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerImgActionPerformed
        if(0 ==  mhDB){
            textArea.setText("Please open device first!\n");
        }
        String path = "d:\\test\\fingerprint.bmp";
        byte[] fpTemplate = new byte[2048];
        int[] sizeFPTemp = new int[1];
        sizeFPTemp[0] = 2048;
        int ret = FingerprintSensorEx.ExtractFromImage(mhDB, path, 500, fpTemplate, sizeFPTemp);
        if (0 == ret){
                if (bIdentify){
                        int[] fid = new int[1];
                        int[] score = new int [1];
                        ret = FingerprintSensorEx.DBIdentify(mhDB, fpTemplate, fid, score);
                        if (ret == 0){
                            textArea.setText("Identify succ, fid=" + fid[0] + ",score=" + score[0] + "\n");
                        }else{
                            textArea.setText("Identify fail, errcode=" + ret +"\n");
                        }
                            
		}else{
                    if(cbRegTemp <= 0){
                        textArea.setText("Please register first!\n");
                    }else{
                        ret = FingerprintSensorEx.DBMatch(mhDB, lastRegTemp, fpTemplate);
                        if(ret > 0){
                            textArea.setText("Verify succ, score=" + ret + "\n");
                        }else{
                            textArea.setText("Verify fail, ret=" + ret +"\n");
                        }
                    }
            }
    }else{
        textArea.setText("ExtractFromImage fail, ret=" + ret + "\n");
    }			
    }//GEN-LAST:event_btnVerImgActionPerformed

    /*this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.addWindowListener(new WindowAdapter(){      
        FreeSensor();
    });*/
                
    private void FreeSensor(){
        mbStop = true;
        try {		//wait for thread stopping
                Thread.sleep(1000);
        } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        if (0 != mhDB)
        {
                FingerprintSensorEx.DBFree(mhDB);
                mhDB = 0;
        }
        if (0 != mhDevice)
        {
                FingerprintSensorEx.CloseDevice(mhDevice);
                mhDevice = 0;
        }
        FingerprintSensorEx.Terminate();
	}
	
	public static void writeBitmap(byte[] imageBuf, int nWidth, int nHeight,
			String path) throws IOException {
		java.io.FileOutputStream fos = new java.io.FileOutputStream(path);
		java.io.DataOutputStream dos = new java.io.DataOutputStream(fos);

		int w = (((nWidth+3)/4)*4);
		int bfType = 0x424d; // �?图文件类型（0—1字节）
		int bfSize = 54 + 1024 + w * nHeight;// bmp文件的大�?（2—5字节）
		int bfReserved1 = 0;// �?图文件�?留字，必须为0（6-7字节）
		int bfReserved2 = 0;// �?图文件�?留字，必须为0（8-9字节）
		int bfOffBits = 54 + 1024;// 文件头开始到�?图实际数�?�之间的字节的�??移�?（10-13字节）

		dos.writeShort(bfType); // 输入�?图文件类型'BM'
		dos.write(changeByte(bfSize), 0, 4); // 输入�?图文件大�?
		dos.write(changeByte(bfReserved1), 0, 2);// 输入�?图文件�?留字
		dos.write(changeByte(bfReserved2), 0, 2);// 输入�?图文件�?留字
		dos.write(changeByte(bfOffBits), 0, 4);// 输入�?图文件�??移�?

		int biSize = 40;// 信�?�头所需的字节数（14-17字节）
		int biWidth = nWidth;// �?图的宽（18-21字节）
		int biHeight = nHeight;// �?图的高（22-25字节）
		int biPlanes = 1; // 目标设备的级别，必须是1（26-27字节）
		int biBitcount = 8;// �?个�?素所需的�?数（28-29字节），必须是1�?（�?�色）�?4�?（16色）�?8�?（256色）或者24�?（真彩色）之一。
		int biCompression = 0;// �?图压缩类型，必须是0（�?压缩）（30-33字节）�?1（BI_RLEB压缩类型）或2（BI_RLE4压缩类型）之一。
		int biSizeImage = w * nHeight;// 实际�?图图�?的大�?，�?�整个实际绘制的图�?大�?（34-37字节）
		int biXPelsPerMeter = 0;// �?图水平分辨率，�?米�?素数（38-41字节）这个数是系统默认值
		int biYPelsPerMeter = 0;// �?图垂直分辨率，�?米�?素数（42-45字节）这个数是系统默认值
		int biClrUsed = 0;// �?图实际使用的颜色表中的颜色数（46-49字节），如果为0的�?，说明全部使用了
		int biClrImportant = 0;// �?图显示过程中�?�?的颜色数(50-53字节)，如果为0的�?，说明全部�?�?

		dos.write(changeByte(biSize), 0, 4);// 输入信�?�头数�?�的总字节数
		dos.write(changeByte(biWidth), 0, 4);// 输入�?图的宽
		dos.write(changeByte(biHeight), 0, 4);// 输入�?图的高
		dos.write(changeByte(biPlanes), 0, 2);// 输入�?图的目标设备级别
		dos.write(changeByte(biBitcount), 0, 2);// 输入�?个�?素�?��?�的字节数
		dos.write(changeByte(biCompression), 0, 4);// 输入�?图的压缩类型
		dos.write(changeByte(biSizeImage), 0, 4);// 输入�?图的实际大�?
		dos.write(changeByte(biXPelsPerMeter), 0, 4);// 输入�?图的水平分辨率
		dos.write(changeByte(biYPelsPerMeter), 0, 4);// 输入�?图的垂直分辨率
		dos.write(changeByte(biClrUsed), 0, 4);// 输入�?图使用的总颜色数
		dos.write(changeByte(biClrImportant), 0, 4);// 输入�?图使用过程中�?�?的颜色数

		for (int i = 0; i < 256; i++) {
			dos.writeByte(i);
			dos.writeByte(i);
			dos.writeByte(i);
			dos.writeByte(0);
		}

		byte[] filter = null;
		if (w > nWidth)
		{
			filter = new byte[w-nWidth];
		}
		
		for(int i=0;i<nHeight;i++)
		{
			dos.write(imageBuf, (nHeight-1-i)*nWidth, nWidth);
			if (w > nWidth)
				dos.write(filter, 0, w-nWidth);
		}
		dos.flush();
		dos.close();
		fos.close();
	}

	public static byte[] changeByte(int data) {
		return intToByteArray(data);
	}
	
	public static byte[] intToByteArray (final int number) {
		byte[] abyte = new byte[4];  
	    // "&" 与（AND），对两个整型�?作数中对应�?执行布尔代数，两个�?都为1时输出1，�?�则0。  
	    abyte[0] = (byte) (0xff & number);  
	    // ">>"�?�移�?，若为正数则高�?补0，若为负数则高�?补1  
	    abyte[1] = (byte) ((0xff00 & number) >> 8);  
	    abyte[2] = (byte) ((0xff0000 & number) >> 16);  
	    abyte[3] = (byte) ((0xff000000 & number) >> 24);  
	    return abyte; 
	}	 
		 
		public static int byteArrayToInt(byte[] bytes) {
			int number = bytes[0] & 0xFF;  
		    // "|="按�?或赋值。  
		    number |= ((bytes[1] << 8) & 0xFF00);  
		    number |= ((bytes[2] << 16) & 0xFF0000);  
		    number |= ((bytes[3] << 24) & 0xFF000000);  
		    return number;  
		 }
	
		private class WorkThread extends Thread {
	        @Override
	        public void run() {
	            super.run();
	            int ret = 0;
	            while (!mbStop) {
	            	templateLen[0] = 2048;
	            	if (0 == (ret = FingerprintSensorEx.AcquireFingerprint(mhDevice, imgbuf, template, templateLen)))
	            	{
	            		if (nFakeFunOn == 1)
                    	{
                    		byte[] paramValue = new byte[4];
            				int[] size = new int[1];
            				size[0] = 4;
            				int nFakeStatus = 0;
            				//GetFakeStatus
            				ret = FingerprintSensorEx.GetParameters(mhDevice, 2004, paramValue, size);
            				nFakeStatus = byteArrayToInt(paramValue);
            				System.out.println("ret = "+ ret +",nFakeStatus=" + nFakeStatus);
            				if (0 == ret && (byte)(nFakeStatus & 31) != 31)
            				{
            					textArea.setText("Is a fake finger?\n");
            					return;
            				}
                    	}
                    	OnCatpureOK(imgbuf);
                    	OnExtractOK(template, templateLen[0]);
	            	}
	                try {
	                    Thread.sleep(500);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }

	            }
	        }
	    }
		
		private void OnCatpureOK(byte[] imgBuf)
		{
			try {
				writeBitmap(imgBuf, fpWidth, fpHeight, "fingerprint.bmp");
				btnImg.setIcon(new ImageIcon(ImageIO.read(new File("fingerprint.bmp"))));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		private void OnExtractOK(byte[] template, int len)
		{
			if(bRegister)
			{
				int[] fid = new int[1];
				int[] score = new int [1];
                int ret = FingerprintSensorEx.DBIdentify(mhDB, template, fid, score);
                if (ret == 0)
                {
                    textArea.setText("the finger already enroll by " + fid[0] + ",cancel enroll\n");
                    bRegister = false;
                    enroll_idx = 0;
                    return;
                }
                if (enroll_idx > 0 && FingerprintSensorEx.DBMatch(mhDB, regtemparray[enroll_idx-1], template) <= 0)
                {
                	textArea.setText("please press the same finger 3 times for the enrollment\n");
                    return;
                }
                System.arraycopy(template, 0, regtemparray[enroll_idx], 0, 2048);
                enroll_idx++;
                if (enroll_idx == 3) {
                	int[] _retLen = new int[1];
                    _retLen[0] = 2048;
                    byte[] regTemp = new byte[_retLen[0]];
                    
                    if (0 == (ret = FingerprintSensorEx.DBMerge(mhDB, regtemparray[0], regtemparray[1], regtemparray[2], regTemp, _retLen)) &&
                    		0 == (ret = FingerprintSensorEx.DBAdd(mhDB, iFid, regTemp))) {
                    	iFid++;
                    	cbRegTemp = _retLen[0];
                        System.arraycopy(regTemp, 0, lastRegTemp, 0, cbRegTemp);
                        //Base64 Template
                        textArea.setText("enroll succ:\n");
                    } else {
                    	textArea.setText("enroll fail, error code=" + ret + "\n");
                    }
                    bRegister = false;
                } else {
                	textArea.setText("You need to press the " + (3 - enroll_idx) + " times fingerprint\n");
                }
			}
			else
			{
				if (bIdentify)
				{
					int[] fid = new int[1];
					int[] score = new int [1];
					int ret = FingerprintSensorEx.DBIdentify(mhDB, template, fid, score);
                    if (ret == 0)
                    {
                    	textArea.setText("Identify succ, fid=" + fid[0] + ",score=" + score[0] +"\n");
                    }
                    else
                    {
                    	textArea.setText("Identify fail, errcode=" + ret + "\n");
                    }
                        
				}
				else
				{
					if(cbRegTemp <= 0)
					{
						textArea.setText("Please register first!\n");
					}
					else
					{
						int ret = FingerprintSensorEx.DBMatch(mhDB, lastRegTemp, template);
						if(ret > 0)
						{
							textArea.setText("Verify succ, score=" + ret + "\n");
						}
						else
						{
							textArea.setText("Verify fail, ret=" + ret + "\n");
						}
					}
				}
			}
		}
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnEnroll;
    private javax.swing.JButton btnIdentify;
    private javax.swing.JButton btnImg;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnRegImg;
    private javax.swing.JButton btnVerImg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioANSI;
    private javax.swing.JRadioButton radioISO;
    private javax.swing.JRadioButton radioZK;
    private javax.swing.JTextArea textArea;

}
