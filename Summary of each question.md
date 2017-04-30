# Summary of each question

### 格式说明：题号用二号字体 && 详细内容用五号字体

### 内容说明：每道题必须要有总结

------

### 566_Reshape the Matrix  

##### 关于二维数组，```int[][] arr = new int[][]```二维数组的行号row用arr.length来表示，列号col用arr[0].length来表示。所以加入要遍历该二维数组的话那就

```java
for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
               nums[i][j]...//对该数组的值进行操作
            }
        }
```

## 344_Reverse String

##### 关于字符串逆转输出，也即 Given s = "hello", return "olleh".若按照传统的倒序输出的话会时间超时，所以只能将字符串转换成数组，并将数组第一个字符和最后一个字符交换，依次交换下去，最后将数组再转换成字符串输出即可。当然最简单的是调用StringBuilder的reverse()函数一步搞定



