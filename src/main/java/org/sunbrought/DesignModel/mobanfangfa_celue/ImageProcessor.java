package org.sunbrought.DesignModel.mobanfangfa_celue;

import java.awt.image.BufferedImage;

/**
 * 假设我们要实现一个图片处理程序，可以对不同类型的图片进行处理，包括缩放、旋转和裁剪等操作。具体的处理算法可以根据不同类型的图片而异。
 * 首先，我们定义一个抽象类 ImageProcessor，它包含一个模板方法 processImage()，该方法定义了一系列的处理步骤，包括打开图片、
 * 执行具体的处理算法和保存图片等。其中，具体的处理算法是由策略模式来实现的，我们使用一个抽象策略接口 ImageProcessingStrategy 来定义不同的处理算法。
 */
public abstract class ImageProcessor {

    public void processImage() {
        BufferedImage image = openImage();
        ImageProcessingStrategy strategy = createImageProcessingStrategy();
        BufferedImage processedImage = strategy.processImage(image);
        saveImage(processedImage);
    }

    protected BufferedImage openImage() {
        // 打开图片的具体实现
        return new BufferedImage(1,2,3);
    }

    protected abstract ImageProcessingStrategy createImageProcessingStrategy();

    protected void saveImage(BufferedImage image) {
        // 保存图片的具体实现
    }
}
