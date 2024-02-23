import request from '@/utils/request'

// 查询划拨记录列表
export function listTransfer(query) {
  return request({
    url: '/system/transfer/list',
    method: 'get',
    params: query
  })
}

// 查询划拨记录详细
export function getTransfer(id) {
  return request({
    url: '/system/transfer/' + id,
    method: 'get'
  })
}

// 新增划拨记录
export function addTransfer(data) {
  return request({
    url: '/system/transfer',
    method: 'post',
    data: data
  })
}

// 修改划拨记录
export function updateTransfer(data) {
  return request({
    url: '/system/transfer',
    method: 'put',
    data: data
  })
}

// 删除划拨记录
export function delTransfer(id) {
  return request({
    url: '/system/transfer/' + id,
    method: 'delete'
  })
}
