import request from '@/utils/request'

// 查询问卷结果列表
export function listWenjuanjieguo(query) {
  return request({
    url: '/system/wenjuanjieguo/list',
    method: 'get',
    params: query
  })
}

// 查询问卷结果详细
export function getWenjuanjieguo(id) {
  return request({
    url: '/system/wenjuanjieguo/' + id,
    method: 'get'
  })
}

// 新增问卷结果
export function addWenjuanjieguo(data) {
  return request({
    url: '/system/wenjuanjieguo',
    method: 'post',
    data: data
  })
}

// 修改问卷结果
export function updateWenjuanjieguo(data) {
  return request({
    url: '/system/wenjuanjieguo',
    method: 'put',
    data: data
  })
}

// 删除问卷结果
export function delWenjuanjieguo(id) {
  return request({
    url: '/system/wenjuanjieguo/' + id,
    method: 'delete'
  })
}
