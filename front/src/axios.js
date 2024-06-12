// src/axios.js
import axios from 'axios';

const instance = axios.create({
    baseURL: 'http://localhost:8080',
    headers: {
        'Access-Control-Allow-Origin': 'http://localhost:5173',
        'Access-Control-Allow-Methods': 'GET, PUT, POST, DELETE, PATCH, OPTIONS'
    },
    withCredentials: true // 如果需要发送cookie或者认证信息
});

instance.interceptors.request.use(config => {
    const token = localStorage.getItem('token');
    if (token) {
        config.headers.Authorization = `Bearer ${token}`;
    }
    return config;
});

export default instance;
