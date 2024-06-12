// src/store/index.js
import { createStore } from 'vuex';
import user from './modules/user';
import article from './modules/article';
import axios from '../axios';

const store = createStore({
    modules: {
        user,
        article,
    },
    state: {
        user: null,
        token: localStorage.getItem('token') || '',
    },
    mutations: {
        SET_USER(state, user) {
            state.user = user;
        },
        SET_TOKEN(state, token) {
            state.token = token;
        },
        LOGOUT(state) {
            state.user = null;
            state.token = '';
            localStorage.removeItem('token');
        },
    },
    actions: {
        async login({ commit }, credentials) {
            const response = await axios.post('/api/login', credentials);
            const token = response.data.token;
            localStorage.setItem('token', token);
            commit('SET_TOKEN', token);
            commit('SET_USER', response.data.user); // 假设后端返回用户信息
        },
        logout({ commit }) {
            commit('LOGOUT');
        },
    },
    getters: {
        isAuthenticated(state) {
            return !!state.token;
        },
    },
});

export default store;
